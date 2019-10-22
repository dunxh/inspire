package com.inspire.web.controller;

import com.inspire.entity.User;
import com.inspire.web.com.inspire.service.ProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController("web")
public class MainController {

    public  static Logger logger= LoggerFactory.getLogger(MainController.class);




    @Autowired
    private ProducerService producerService;


    @GetMapping("/main")
    public User getMsg(){
        logger.info("开始调用！");
        return producerService.getUser();

    }
}
