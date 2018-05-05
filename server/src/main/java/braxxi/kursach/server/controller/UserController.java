package braxxi.kursach.server.controller;

import braxxi.kursach.commons.entity.ActionEntity;
import braxxi.kursach.commons.entity.PageEntity;
import braxxi.kursach.commons.entity.ScriptEntity;
import braxxi.kursach.commons.entity.UserEntity;
import braxxi.kursach.commons.service.DbService;
import braxxi.kursach.server.security.CurrentUser;
import braxxi.kursach.server.service.ScriptService;
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
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    public static final Long START_PAGE_ID = 0L;

    @Autowired
    DbService dbService;

    @Autowired
    ScriptService scriptService;

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
        UserEntity temp = dbService.findByLogin(user.getLogin());
        if (temp == null) {
            dbService.createUser(user);
            return "userAdded";
        } else {
            return "addUser";
        }
    }

    @GetMapping("/user/resources")
    public String addResoursesView(@ModelAttribute(name = "user") UserEntity user, ModelMap model) {
        UserEntity userResources = dbService.getUserResources(getCurrentUserId());
        user.setBandage(userResources.getBandage());
        user.setRadiation(userResources.getRadiation());
        user.setCartridges(userResources.getCartridges());
        user.setGold(userResources.getGold());
        return "resources";
    }

    @PostMapping("/user/resources")
    public String addResourses(@RequestParam("action") String action, Model model) {
        UserEntity userResources = dbService.getUserResources(getCurrentUserId());

        if ("bandage+".equals(action)) {
            if (userResources.getGold() >= 100) {
                userResources.setGold(userResources.getGold() - 100);
                userResources.setBandage(userResources.getBandage() + 1);
                dbService.updateUserResources(userResources);
            } else {
                // alert
            }
        }

        if ("bandage-".equals(action)) {
            if (userResources.getBandage() >= 1) {
                userResources.setGold(userResources.getGold() + 100);
                userResources.setBandage(userResources.getBandage() - 100);
                dbService.updateUserResources(userResources);
            }
        }
        if ("cartridges+".equals(action)) {
            if (userResources.getGold() >= 25) {
                userResources.setGold(userResources.getGold() - 25);
                userResources.setCartridges(userResources.getCartridges() + 1);
                dbService.updateUserResources(userResources);
            }
        }
        if ("cartridges-".equals(action)) {
            if (userResources.getCartridges() >= 1) {
                userResources.setGold(userResources.getGold() + 25);
                userResources.setCartridges(userResources.getCartridges() - 1);
                dbService.updateUserResources(userResources);
            }
        }
        if ("radiation+".equals(action)) {
            if (userResources.getGold() >= 300) {
                userResources.setGold(userResources.getGold() - 300);
                userResources.setRadiation(userResources.getRadiation() + 1);
                dbService.updateUserResources(userResources);
            }
        }
        if ("radiation-".equals(action)) {
            if (userResources.getRadiation() >= 1) {
                userResources.setGold(userResources.getGold() + 300);
                userResources.setRadiation(userResources.getRadiation() - 1);
                dbService.updateUserResources(userResources);
            }
        }

        userResources.setBandage(userResources.getBandage());
        userResources.setRadiation(userResources.getRadiation());
        userResources.setCartridges(userResources.getCartridges());
        userResources.setGold(userResources.getGold());

        model.addAttribute("userResources", userResources);
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
        dbService.updateUser(user);
        return "userUpdated";
    }

    @GetMapping("/user/choiceGroup")
    public String choiceGroupView(Model model) {
        UserEntity ue = dbService.getFullUserInfo(getCurrentUserId());
        if (ue.getGroup_id() == -1) {
            model.addAttribute("groups", dbService.getAllGroups());
            return "choiceGroup";
        } else {
            if (ue.getCurrentPageId() == 0) {
                return "redirect:main";
            } else {
                return "redirect:game";
            }
        }
    }

    @PostMapping("/user/choiceGroup")
    public String choiceGroup(@RequestParam("group") int group, Model model) {
        UserEntity ue = new UserEntity(getCurrentUserId());
        ue.setGroup_id(group);
        dbService.updateGroup(ue);
        return "redirect:main";
    }

    @GetMapping("/user/main")
    public String mainView(Model model) {
        UserEntity ue = dbService.getFullUserInfo(getCurrentUserId());
        ////
        ScriptEntity se = scriptService.getScript(ue.getGroup_id());
        model.addAttribute("script", se);
        return "main";
    }

    @PostMapping("/user/main")
    public String main(Model model) {
        return "redirect:game";
    }

    @GetMapping("/user/game")
    public String gameView(Model model) {
        UserEntity ue = dbService.getFullUserInfo(getCurrentUserId());
        Long pageID = ue.getCurrentPageId();
        ////
        ScriptEntity se = scriptService.getScript(ue.getGroup_id());
        PageEntity pe = se.getPage(pageID);
        model.addAttribute("page", pe);
        return "game";
    }

    @PostMapping("/user/game")
    public String game(@RequestParam("action") Integer action, Model model) {
        UserEntity ue = dbService.getFullUserInfo(getCurrentUserId());
        Long pageID = ue.getCurrentPageId();
        ////
        //ScriptEntity se = scriptService.getScript1();
        ScriptEntity se = scriptService.getScript(ue.getGroup_id());

        /*if (pageID.equals(se.getEndPage())) {
            Map pm = se.getPageMap();
            PageEntity pe = (PageEntity) pm.get(pageID);
            ActionEntity ae = (ActionEntity) pe.getActionList().get(action);
            ue.setBandage(ue.getBandage() + ae.getBandage());
            ue.setRadiation(ue.getRadiation() + ae.getRadiation());
            ue.setCartridges(ue.getRadiation() + ae.getRadiation());
            ue.setGold(ue.getGold() + ae.getGold());
            if (ae.getTransit()== -1) {
                ue.setMap(new Long(0));
                userDao.updateResourses(ue);
                return "redirect:die";

            }


            ue.setMap(new Long(0));
            userDao.updateResourses(ue);
            return "redirect:gameEnd";
        } else {*/
        Map pm = se.getPageMap();
        PageEntity pe = (PageEntity) pm.get(pageID);
        ActionEntity ae = (ActionEntity) pe.getActionList().get(action);
        ue.setBandage(ue.getBandage() + ae.getBandage());
        ue.setRadiation(ue.getRadiation() + ae.getRadiation());
        ue.setCartridges(ue.getRadiation() + ae.getRadiation());
        ue.setGold(ue.getGold() + ae.getGold());
        if (ae.getTransit() == -1) {
            ue.setCurrentPageId(START_PAGE_ID);
            dbService.updateUserResources(ue);
            return "redirect:die";
        } else {
            if (ae.getTransit() == -2) {
                ue.setCurrentPageId(START_PAGE_ID);
                dbService.updateUserResources(ue);
                return "redirect:badend";
            } else {
                if (pageID.equals(se.getEndPage())) {
                    ue.setCurrentPageId(START_PAGE_ID);
                    dbService.updateUserResources(ue);
                    return "redirect:gameEnd";
                } else {
                    ue.setCurrentPageId((long) ae.getTransit());
                    dbService.updateUserResources(ue);
                    PageEntity peNew = (PageEntity) pm.get(ue.getCurrentPageId());
                    model.addAttribute("page", peNew);
                }
            }
        }
        return "game";
        /*}*/
    }

    @GetMapping("/user/gameEnd")
    public String gameEndView(Model model) {
        return "gameEnd";
    }

    @PostMapping("/user/gameEnd")
    public String gameEnd(Model model) {
        return "redirect:main";

    }

    @GetMapping("/user/die")
    public String dieView(Model model) {
        return "die";
    }

    @PostMapping("/user/die")
    public String die(Model model) {
        return "redirect:main";

    }

    @GetMapping("/user/badend")
    public String badendView(Model model) {
        return "badend";
    }

    @PostMapping("/user/badend")
    public String badend(Model model) {
        return "redirect:main";
    }

    @GetMapping("/user/about")
    public String aboutView(@ModelAttribute(name = "user") UserEntity user) {
        return "about";
    }

    @GetMapping("/user/test")
    public String testView(@ModelAttribute(name = "user") UserEntity user) {
        return "test";
    }

    @PostMapping("/user/test")
    public String test(Model model) {
        return "test";
    }

    @GetMapping("/user/gallery")
    public String galleryView(@ModelAttribute(name = "user") UserEntity user) {
        return "gallery";
    }

    @GetMapping("/user/stalkers")
    public String stalkersView(Model model) {
        List<UserEntity> ue = dbService.getAllUsers();
        model.addAttribute("groups", ue);
        return "stalkers";
    }

}