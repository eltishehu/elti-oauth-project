package com.eltishehu.oauth.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by e.sh. on 12-Nov-18
 */
@RestController
public class AdminController {

    @RequestMapping("/admin/{name}")
    public String hello(@PathVariable("name") String name){
        return "Hello "
                + name.toUpperCase().charAt(0)
                + name.substring(1);
    }

}
