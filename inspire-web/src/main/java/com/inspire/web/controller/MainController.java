package com.inspire.web.controller;

import com.inspire.entity.User;
import com.inspire.web.com.inspire.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController("web")
public class MainController {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private ProducerService producerService;

//    @Autowired
//    private RestTemplate restTemplate;

    @GetMapping("/main")
    public User getMsg(){
        return producerService.getUser();
//        return "d";
//        return restTemplate.getForObject("http://localhost:8010/user/simple/" + id, User.class);

    }
}
