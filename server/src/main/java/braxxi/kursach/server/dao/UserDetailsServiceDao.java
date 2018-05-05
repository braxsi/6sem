package braxxi.kursach.server.dao;

import braxxi.kursach.commons.entity.UserEntity;
import braxxi.kursach.commons.service.DbService;
import braxxi.kursach.server.security.CurrentUser;
import com.google.common.collect.ImmutableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class UserDetailsServiceDao implements UserDetailsService {

    @Autowired
    private DbService dbService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = dbService.findByLogin(username);
        if (user == null) {
            throw new UsernameNotFoundException("username " + username);
        }
        ImmutableList<SimpleGrantedAuthority> roles = ImmutableList.of(new SimpleGrantedAuthority("ROLE_USER"));
        return new CurrentUser(user, roles);
    }
}
