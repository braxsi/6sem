package braxxi.kursach.server.security;

import braxxi.kursach.commons.entity.UserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class CurrentUser extends User {

    private UserEntity userEntity;

    public CurrentUser(UserEntity userEntity, Collection<? extends GrantedAuthority> authorities) {
        super(userEntity.getLogin(), userEntity.getPassword(), authorities);
        this.userEntity = userEntity;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }
}
