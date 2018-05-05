package braxxi.kursach.commons.service;

import braxxi.kursach.commons.entity.UserEntity;

import java.util.List;

public interface DbService {

    UserEntity findByLogin(String login);

    Long createUser(UserEntity user);

    UserEntity getUserResources(Long userId);

    void updateUserResources(UserEntity userResources);

    void updateUser(UserEntity user);

    UserEntity getFullUserInfo(Long userId);

    Object getAllGroups();

    void updateGroup(UserEntity userGroup);

    List<UserEntity> getAllUsers();

}
