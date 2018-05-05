package braxxi.kursach.server.service;


import braxxi.kursach.commons.entity.UserEntity;
import braxxi.kursach.commons.service.DbService;
import braxxi.kursach.server.dao.EstateDao;
import braxxi.kursach.server.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DbServiceImpl implements DbService {

    @Autowired
    UserDao userDao;

    @Autowired
    EstateDao estateDao;

    @Override
    public UserEntity findByLogin(String login) {
        return userDao.login(login);
    }

    @Override
    public Long createUser(UserEntity user) {
        user.setId(userDao.addUser(user));
        user.setRadiation(0);
        user.setBandage(0);
        user.setCartridges(0);
        user.setGold(1000);
        userDao.addResources(user);
        return user.getId();
    }

    @Override
    public UserEntity getUserResources(Long userId) {
        return userDao.getUserResources(userId);
    }

    @Override
    public void updateUserResources(UserEntity userResources) {
        userDao.updateUserResources(userResources);
    }

    @Override
    public void updateUser(UserEntity user) {
        userDao.updateUser(user);
    }

    @Override
    public UserEntity getFullUserInfo(Long userId) {
        return userDao.getAllUserInfo(userId);
    }

    @Override
    public Object getAllGroups() {
        return userDao.getAllGroups();
    }

    @Override
    public void updateGroup(UserEntity userGroup) {
        userDao.updateGroup(userGroup);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        List<UserEntity> allUsers = userDao.getAllUsers();
        for (int i = 0; i < allUsers.size(); i++) {
            UserEntity userEntity = allUsers.get(i);
            if (userEntity.getGroup_id() == -1) {
                userEntity.setGroupName("");
            } else {
                String groupName = userDao.getGroup(userEntity.getGroup_id()).getName();
                userEntity.setGroupName(groupName);
            }
        }
        return allUsers;
    }

}
