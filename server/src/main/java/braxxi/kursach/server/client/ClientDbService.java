package braxxi.kursach.server.client;

import braxxi.kursach.commons.entity.UserEntity;
import braxxi.kursach.commons.service.DbService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ClientDbService implements DbService {

    @Value("${businessUrl}")
    private String businessUrl;

    private RestTemplate restTemplate = new RestTemplate();

    private <T> T postForObject(String action, Object requestObject, Class<T> aClass) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(requestObject, headers);
        return restTemplate.postForObject(businessUrl + "/" + action, entity, aClass);
    }

    private void postForVoid(String action, Object requestObject) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(requestObject, headers);
        restTemplate.postForEntity(businessUrl + "/" + action, entity, Void.class);
    }

    @Override
    public UserEntity findByLogin(String login) {
        return postForObject("findByLogin", login, UserEntity.class);
    }

    @Override
    public Long createUser(UserEntity user) {
        return postForObject("createUser", user, Long.class);
    }

    @Override
    public UserEntity getUserResources(Long userId) {
        return postForObject("getUserResources", userId, UserEntity.class);
    }

    @Override
    public void updateUserResources(UserEntity userResources) {
        postForVoid("updateUserResources", userResources);
    }

    @Override
    public void updateUser(UserEntity user) {
        postForVoid("updateUser", user);
    }

    @Override
    public UserEntity getFullUserInfo(Long userId) {
        return postForObject("getFullUserInfo", userId, UserEntity.class);
    }

    @Override
    public Object getAllGroups() {
        return postForObject("getAllGroups", null, Object.class);
    }

    @Override
    public void updateGroup(UserEntity userGroup) {
        postForVoid("updateGroup", userGroup);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        // new ParameterizedTypeReference<List<UserEntity>>() {}
        return Arrays.asList(postForObject("getAllUsers", null, UserEntity[].class));
    }
}
