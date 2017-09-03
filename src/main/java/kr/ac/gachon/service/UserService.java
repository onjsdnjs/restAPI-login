package kr.ac.gachon.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Collection;

/**
 * Created by hongjong-wan on 2017. 9. 3..
 */
public interface UserService extends UserDetailsService {
    Collection<GrantedAuthority> getAuthorities(String username);
}


