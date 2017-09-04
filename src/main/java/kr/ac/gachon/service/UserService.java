package kr.ac.gachon.service;

import kr.ac.gachon.domain.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Collection;

/**
 * Created by hongjong-wan on 2017. 9. 3..
 */
public interface UserService extends UserDetailsService {
    Collection<GrantedAuthority> getAuthorities(String username);

    public User readUser(String username);
    public void createUser(User user);
    public void deleteUser(String username);
    public PasswordEncoder passwordEncoder();
}


