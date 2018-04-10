package braxxi.kursach.server.controller;

import braxxi.kursach.commons.entity.UserEntity;
import braxxi.kursach.server.dao.EstateDao;
import braxxi.kursach.server.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserDao userDao;


    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", LocalDateTime.now());
        model.put("message", "sdf");
        return "welcome";
    }

    @GetMapping("/addUser")
    public String addUserView(@ModelAttribute(name = "user") UserEntity user) {
        return "addUser";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute(name = "user") UserEntity user, ModelMap model) {
        user.setId(userDao.addUser(user));
        user.setRadiation(0);
        user.setBandage(0);
        user.setCartridges(0);
        user.setGold(1000);
        userDao.addResourses(user);
        return "userAdded";
    }
    @GetMapping("/resourses")
    public String addResoursesView(@ModelAttribute(name = "user") UserEntity user, ModelMap model) {
        UserEntity eu = userDao.getResourses(new Long(1));
        user.setBandage(eu.getBandage());
        user.setRadiation(eu.getRadiation());
        user.setCartridges(eu.getCartridges());
        user.setGold(eu.getGold());
/*        if (model.get("bandage+")!=null) {
            eu.setGold(eu.getGold()-100);
            eu.setBandage(eu.getBandage()+1);
            userDao.updateResourses(eu);
        }
        if (model.get("bandage-")!=null) {
            eu.setGold(eu.getGold()+100);
            eu.setBandage(eu.getBandage()-1);
            userDao.updateResourses(eu);
        }
        if (model.get("cartridges+")!=null) {
            eu.setGold(eu.getGold()-500);
            eu.setCartridges(eu.getCartridges()+1);
            userDao.updateResourses(eu);
        }
        if (model.get("cartridges-")!=null) {
            eu.setGold(eu.getGold()+500);
            eu.setCartridges(eu.getCartridges()-1);
            userDao.updateResourses(eu);
        }
        if (model.get("radiation+")!=null) {
            eu.setGold(eu.getGold()-1000);
            eu.setRadiation(eu.getRadiation()+1);
            userDao.updateResourses(eu);
        }
        if (model.get("radiation-")!=null) {
            eu.setGold(eu.getGold()+1000);
            eu.setRadiation(eu.getRadiation()-1);
            userDao.updateResourses(eu);
        }
        */
        return "resourses";
    }
    @PostMapping("/resourses")
    public String addResourses(@ModelAttribute(name = "user") UserEntity user, ModelMap model, HttpServletRequest request) {
        UserEntity eu = userDao.getResourses(new Long(1));
        //request.getParameter()
        if (request.getParameter("bandage1")!=null) {
            if (eu.getGold()>=100) {
                eu.setGold(eu.getGold() - 100);
                eu.setBandage(eu.getBandage() + 1);
                userDao.updateResourses(eu);
            }
        }
        if (request.getParameter("bandage2")!=null) {
            if (eu.getBandage()>=1) {
                eu.setGold(eu.getGold() + 100);
                eu.setBandage(eu.getBandage() - 1);
                userDao.updateResourses(eu);
            }
        }
        if (request.getParameter("cartridges1")!=null) {
            if (eu.getGold()>=500) {
                eu.setGold(eu.getGold() - 500);
                eu.setCartridges(eu.getCartridges() + 1);
                userDao.updateResourses(eu);
            }
        }
        if (request.getParameter("cartridges2")!=null) {
            if (eu.getCartridges()>=1) {
                eu.setGold(eu.getGold() + 500);
                eu.setCartridges(eu.getCartridges() - 1);
                userDao.updateResourses(eu);
            }
        }
        if (request.getParameter("radiation1")!=null) {
            if (eu.getGold()>=1000) {
                eu.setGold(eu.getGold() - 1000);
                eu.setRadiation(eu.getRadiation() + 1);
                userDao.updateResourses(eu);
            }
        }
        if (request.getParameter("radiation2")!=null) {
            if (eu.getRadiation()>=1) {
                eu.setGold(eu.getGold() + 1000);
                eu.setRadiation(eu.getRadiation() - 1);
                userDao.updateResourses(eu);
            }
        }
        user.setBandage(eu.getBandage());
        user.setRadiation(eu.getRadiation());
        user.setCartridges(eu.getCartridges());
        user.setGold(eu.getGold());
        return "resourses";
    }
}