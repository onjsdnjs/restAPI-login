package kr.ac.gachon.mapper;

import kr.ac.gachon.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by hongjong-wan on 2017. 9. 3..
 */
@Mapper
public interface UserMapper {
    public User readUser(String username);

    public List<String> readAuthority(String username);
}

