package kr.ac.gachon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hongjong-wan on 2017. 9. 3..
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }


    @RequestMapping("/admin")
    public String admin() {
        return "This is admin page";
    }

    @RequestMapping("/user")
    public String user() {
        return "this is user page";
    }

}
