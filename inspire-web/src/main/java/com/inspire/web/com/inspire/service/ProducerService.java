package com.inspire.web.com.inspire.service;

import com.inspire.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "inspire-producer")
public interface ProducerService {

    @GetMapping("/getUser")
    public User getUser();
}
