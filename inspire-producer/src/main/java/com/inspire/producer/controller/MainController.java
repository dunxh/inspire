package com.inspire.producer.controller;

import com.inspire.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("producter")
public class MainController {

    @GetMapping("/getUser")
    public User getMsg(){
        User user = new User();
        user.setId("1");
        user.setName("test");
        return user;
    }
}
