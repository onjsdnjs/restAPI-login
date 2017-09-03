package kr.ac.gachon.controller;

import kr.ac.gachon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hongjong-wan on 2017. 9. 3..
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UserService userService;

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public AuthenticationToken login(
//            @RequestBody AuthenticationRequest authenticationRequest,
//            HttpSession session) {
//        String username = authenticationRequest.getUsername();
//        String password = authenticationRequest.getPassword();
//
//        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
//        Authentication authentication = authenticationManager.authenticate(token);
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        session.setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY,
//                SecurityContextHolder.getContext());
//
//        User user = userService.readUser(username);
//        return new AuthenticationToken(user.getName(), user.getAuthorities(), session.getId());
//    }
}
