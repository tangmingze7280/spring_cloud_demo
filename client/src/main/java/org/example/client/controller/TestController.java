package org.example.client.controller;

import org.example.client.service.TestOtherService;
import org.example.feign.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("tmq")
@SuppressWarnings("all")
public class TestController {
    @Autowired
    TestService testService;
    @Autowired
    TestOtherService testOtherService;
    @GetMapping("test1")
    public String test1(@RequestParam("msg") String msg){
        return testService.test1(msg);
    }
    @GetMapping("test2")
    public String test2(@RequestParam("msg") String msg){
        return testService.test2(msg);
    }
    @GetMapping("test3")
    public String test3(@RequestParam("msg") String msg){
        return testOtherService.t1(msg);
    }
}
