package kr.ac.gachon.mapper;

import kr.ac.gachon.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

/**
 * Created by hongjong-wan on 2017. 9. 3..
 */
@Mapper
public interface UserMapper {
    public User readUser(String username);

    public List<GrantedAuthority> readAuthority(String username);

    public void createUser(User user);

    public void createAuthority(User user);

    public void deleteUser(String username);

    public void deleteAuthority(String username);

}

