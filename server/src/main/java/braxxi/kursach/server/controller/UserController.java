package braxxi.kursach.server.controller;

import braxxi.kursach.commons.entity.ActionEntity;
import braxxi.kursach.commons.entity.PageEntity;
import braxxi.kursach.commons.entity.ScriptEntity;
import braxxi.kursach.commons.entity.UserEntity;
import braxxi.kursach.server.dao.UserDao;
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

    @Autowired
    UserDao userDao;

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
    @GetMapping("/user/main")
    public String mainView(@ModelAttribute(name = "user") UserEntity user) {
        return "main";
    }

    @PostMapping("/user/main")
    public String main(Model model) {
        //int pageID = 1;
        //ScriptEntity se = Script1.create();
        //PageEntity pe = (PageEntity) se.getPageList().get(pageID);
        return "redirect:game";
    }

    @GetMapping("/user/game")
    public String gameView(Model model) {
        UserEntity ue = userDao.getAllUserInfo(getCurrentUserId());
        Long pageID = ue.getCurrentPageId();
        ////
        ScriptEntity se = scriptService.getScript1();
        PageEntity pe = se.getPage(pageID);
        model.addAttribute("page", pe);
        return "game";
    }

    @PostMapping("/user/game")
    public String game(@RequestParam("action") Integer action, Model model) {
        UserEntity ue = userDao.getAllUserInfo(getCurrentUserId());
        Long pageID = new Long(ue.getCurrentPageId());
        ////
        ScriptEntity se = scriptService.getScript1();

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
            if (ae.getTransit()== -1) {
                ue.setCurrentPageId(new Long(0));
                userDao.updateResourses(ue);
                return "redirect:die";
            } else {
                if (ae.getTransit()== -2) {
                    ue.setMap(new Long(0));
                    userDao.updateResourses(ue);
                    return "redirect:badend";
                } else {
                    if (pageID.equals(se.getEndPage())) {
                        ue.setMap(new Long(0));
                        userDao.updateResourses(ue);
                        return "redirect:gameEnd";
                    } else {
                        ue.setMap(new Long(ae.getTransit()));
                        userDao.updateResourses(ue);
                        PageEntity peNew = (PageEntity) pm.get(ue.getMap());
                        model.addAttribute("page", peNew);
                    }
                }
            }
            return "game";
        /*}*/
    }
    @GetMapping("/user/gameEnd")
    public String gameEndView(Model model) {
        //UserEntity ue = userDao.getAllUserInfo(getCurrentUserId());
        //Long pageID = ue.getCurrentPageId();
        ////
        return "gameEnd";
    }
    @PostMapping("/user/gameEnd")
    public String gameEnd(Model model) {
        return "redirect:main";

    }
    @GetMapping("/user/die")
    public String dieView(Model model) {
        //UserEntity ue = userDao.getAllUserInfo(getCurrentUserId());
        //Long pageID = ue.getCurrentPageId();
        ////
        return "die";
    }
    @PostMapping("/user/die")
    public String die(Model model) {
        return "redirect:main";

    }

    @GetMapping("/user/badend")
    public String badendView(Model model) {
        //UserEntity ue = userDao.getAllUserInfo(getCurrentUserId());
        //Long pageID = ue.getMap();
        ////
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
        /*int pageID = 1;
        ScriptEntity se = Script1.create();
        //PageEntity pe = (PageEntity) se.getPageList().get(pageID);*/
        return "test";
    }

    @GetMapping("/user/gallery")
    public String galleryView(@ModelAttribute(name = "user") UserEntity user) {
        return "gallery";
    }

    @GetMapping("/user/stalkers")
    public String stalkersView(Model model) {
        List<UserEntity> ue = userDao.getAllUsers ();
        for (int i=0; i<ue.size(); i++) {
            UserEntity temp = (UserEntity)ue.get(i);
            if (temp.getGroup_id()==-1) {
                ((UserEntity) ue.get(i)).setGroupName("");
            } else {
                String groupName = ((GroupEntity) userDao.getGroup(temp.getGroup_id())).getName();
                ((UserEntity) ue.get(i)).setGroupName(groupName);
            }
        }
        model.addAttribute("groups", ue);
        return "stalkers";
    }

}