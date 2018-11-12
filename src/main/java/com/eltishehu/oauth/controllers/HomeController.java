package com.eltishehu.oauth.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by e.sh. on 12-Nov-18
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Home Page";
    }

}
