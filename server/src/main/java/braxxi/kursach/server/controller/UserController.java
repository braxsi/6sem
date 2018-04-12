package braxxi.kursach.server.controller;

import braxxi.kursach.commons.entity.UserEntity;
import braxxi.kursach.server.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/resources")
    public String addResoursesView(@ModelAttribute(name = "user") UserEntity user, ModelMap model) {
        UserEntity eu = userDao.getResourses(1L);
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
        return "resources";
    }

    @PostMapping("/resources")
    public String addResourses(@RequestParam("action") String action, Model model) {
//    public String addResourses(TradeResourceRequest request, Model model) {
//        String action = request.getAction();

        UserEntity user = userDao.getResourses(1L);

        if ("bandage+".equals(action)) {
            if (user.getGold()>=100) {
                user.setGold(user.getGold() - 100);
                user.setBandage(user.getBandage() + 1);
                userDao.updateResourses(user);
            } else {
                // alert
            }
        }

        if ("bandage-".equals(action)) {
            if (user.getBandage()>=1) {
                user.setGold(user.getGold() + 100);
                user.setBandage(user.getBandage() - 1);
                userDao.updateResourses(user);
            }
        }
        if ("cartridges+".equals(action)) {
            if (user.getGold()>=500) {
                user.setGold(user.getGold() - 500);
                user.setCartridges(user.getCartridges() + 1);
                userDao.updateResourses(user);
            }
        }
        if ("cartridges-".equals(action)) {
            if (user.getCartridges()>=1) {
                user.setGold(user.getGold() + 500);
                user.setCartridges(user.getCartridges() - 1);
                userDao.updateResourses(user);
            }
        }
        if ("radiation+".equals(action)) {
            if (user.getGold()>=1000) {
                user.setGold(user.getGold() - 1000);
                user.setRadiation(user.getRadiation() + 1);
                userDao.updateResourses(user);
            }
        }
        if ("radiation-".equals(action)) {
            if (user.getRadiation()>=1) {
                user.setGold(user.getGold() + 1000);
                user.setRadiation(user.getRadiation() - 1);
                userDao.updateResourses(user);
            }
        }

        user.setBandage(user.getBandage());
        user.setRadiation(user.getRadiation());
        user.setCartridges(user.getCartridges());
        user.setGold(user.getGold());

        model.addAttribute("user", user);
        return "resources";
    }
    @GetMapping("/login")
    public String ingressUserView(@ModelAttribute(name = "user") UserEntity user) {
        return "login";
    }
    @GetMapping("/updateUser")
    public String updateUserView(@ModelAttribute(name = "user") UserEntity user) {
        return "updateUser";
    }
}