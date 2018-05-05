package braxxi.kursach.server.controller;

import braxxi.kursach.commons.entity.UserEntity;
import braxxi.kursach.commons.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api", method = RequestMethod.POST)
public class RestApiController implements DbService {

    @Autowired
    private DbService dbService;

    @Override
    @PostMapping(value = "findByLogin", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public UserEntity findByLogin(@RequestBody String login) {
        return dbService.findByLogin(login);
    }

    @Override
    @PostMapping(value = "createUser", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Long createUser(@RequestBody UserEntity user) {
        return dbService.createUser(user);
    }

    @Override
    @PostMapping(value = "getUserResources", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public UserEntity getUserResources(@RequestBody Long userId) {
        return dbService.getUserResources(userId);
    }

    @Override
    @PostMapping(value = "updateUserResources", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void updateUserResources(@RequestBody UserEntity userResources) {
        dbService.updateUserResources(userResources);
    }

    @Override
    @PostMapping(value = "updateUser", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void updateUser(@RequestBody UserEntity user) {
        dbService.updateUser(user);
    }

    @Override
    @PostMapping(value = "getFullUserInfo", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public UserEntity getFullUserInfo(@RequestBody Long userId) {
        return dbService.getFullUserInfo(userId);
    }

    @Override
    @PostMapping(value = "getAllGroups", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object getAllGroups() {
        return dbService.getAllGroups();
    }

    @Override
    @PostMapping(value = "updateGroup", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void updateGroup(@RequestBody UserEntity userGroup) {
        dbService.updateGroup(userGroup);
    }

    @Override
    @PostMapping(value = "getAllUsers", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UserEntity> getAllUsers() {
        return dbService.getAllUsers();
    }

}
