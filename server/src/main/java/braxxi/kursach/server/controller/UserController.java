package braxxi.kursach.server.controller;

import braxxi.kursach.commons.entity.UserEntity;
import braxxi.kursach.server.dao.UserDao;
import braxxi.kursach.server.security.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
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
        UserEntity temp = userDao.login(user.getLogin());
        if(temp == null) {
            user.setId(userDao.addUser(user));
            user.setRadiation(0);
            user.setBandage(0);
            user.setCartridges(0);
            user.setGold(1000);
            userDao.addResourses(user);
            return "userAdded";
        } else {
            return "addUser";
        }
    }

    @GetMapping("/user/resources")
    public String addResoursesView(@ModelAttribute(name = "user") UserEntity user, ModelMap model) {
        UserEntity eu = userDao.getResourses(getCurrentUserId());
        user.setBandage(eu.getBandage());
        user.setRadiation(eu.getRadiation());
        user.setCartridges(eu.getCartridges());
        user.setGold(eu.getGold());
        return "resources";
    }

    @PostMapping("/user/resources")
    public String addResourses(@RequestParam("action") String action, Model model) {
        UserEntity user = userDao.getResourses(getCurrentUserId());

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

    private Long getCurrentUserId() {
        CurrentUser currentUser = (CurrentUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return currentUser.getUserEntity().getId();
    }

    @GetMapping("/login")
    public String ingressUserView(@ModelAttribute(name = "user") UserEntity user) {
        return "login";
    }

    @GetMapping("/user/updateUser")
    public String updateUserView(@ModelAttribute(name = "user") UserEntity user) {
        return "updateUser";
    }

    @PostMapping("/user/updateUser")
    public String updateUser(@ModelAttribute(name = "user") UserEntity user, ModelMap model) {
        userDao.updateUser(user);
        return "userUpdated";
    }

    @GetMapping("/user/choiceGroup")
    public String choiceGroupView(Model model) {
        model.addAttribute("groups", userDao.getAllGroups ());
        return "choiceGroup";
    }

    @PostMapping("/user/choiceGroup")
    public String choiceGroup(@RequestParam("group") int group, Model model) {
        // UserEntity ue = new UserEntity(getCurrentUserId());
        UserEntity ue = new UserEntity(getCurrentUserId());
        ue.setGroup_id(group);
        userDao.updateGroup(ue);
        return "groupChoised";
    }
    @GetMapping("/main")
    public String mainView(@ModelAttribute(name = "user") UserEntity user) {
        return "main";
    }

    @PostMapping("/main")
    public String main(@ModelAttribute(name = "user") UserEntity user, ModelMap model) {
        userDao.updateUser(user);
        return "loc1_1";
    }
}