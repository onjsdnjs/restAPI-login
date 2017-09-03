package kr.ac.gachon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hongjong-wan on 2017. 9. 3..
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }
}
