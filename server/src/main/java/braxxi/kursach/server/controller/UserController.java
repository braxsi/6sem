package braxxi.kursach.server.controller;

import braxxi.kursach.commons.entity.UserEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;
import java.util.Map;

@Controller
public class UserController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", LocalDateTime.now());
        model.put("message", "sdf");
        return "welcome";
    }

    @GetMapping("/addUser")
    public String addUserView(Map<String, Object> model) {
        model.put("addUser", new UserEntity());
        model.put("message", "sdf");
        return "addUser";
    }

    @PostMapping("/addUser")
    public String addUser(Map<String, Object> model) {
//        model.put("time", LocalDateTime.now());
//        model.put("message", "sdf");
        return "userAdded";
    }
}
