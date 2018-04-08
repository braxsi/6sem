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
    public String addResourses(@ModelAttribute(name = "user") UserEntity user) {
        return "resourses";
    }
}