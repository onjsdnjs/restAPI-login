package kr.ac.gachon.config;

import kr.ac.gachon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;


/**
 * Created by hongjong-wan on 2017. 9. 3..
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserService userService;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER)
                .and()
                .authorizeRequests()
                .antMatchers("/user/login").permitAll()
                .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                .antMatchers("/user").hasAuthority("USER")
                .antMatchers("/admin").hasAuthority("ADMIN")
                .anyRequest().authenticated()
                .and()
                // .formLogin()
                // .and()
                .logout();

    }


//    @Bean
//    public HttpSessionStrategy httpSessionStrategy() {
//        return new HttpSessionStrategy();
//    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userService).passwordEncoder(userService.passwordEncoder());
        auth.userDetailsService(userService);//.passwordEncoder(userService.passwordEncoder());
    }

    // 이게 뭐에요??? Spring Security에서 사용하는 인증객체
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }



}
