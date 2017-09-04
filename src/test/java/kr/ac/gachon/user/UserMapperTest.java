package kr.ac.gachon.user;


import kr.ac.gachon.domain.User;
import kr.ac.gachon.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by hongjong-wan on 2017. 9. 3..
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void readUserTest() {
        User user = userMapper.readUser("serverwizard");

        assertThat("serverwizard", is(user.getUsername()));
        assertThat("YCU", is(user.getName()));
        assertThat("1234", is(user.getPassword()));
    }

    @Test
    public void readAuthorityTest() {
        List<GrantedAuthority> authorities = userMapper.readAuthority("cusonar");
        Iterator<GrantedAuthority> it = authorities.iterator();
        while (it.hasNext()) {
            GrantedAuthority authority = it.next();
            assertThat(authorities, hasItem(new SimpleGrantedAuthority(authority.getAuthority())));
        }

    }

}
