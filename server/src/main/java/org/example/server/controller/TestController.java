package org.example.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    ApplicationContext applicationContext;
    @GetMapping("test1")
    public String test1(@RequestParam("msg")String msg){
        return msg+"test1";
    }

    @GetMapping("test2")
    public String test2(@RequestParam("msg")String msg){
        if(msg.length()<2){
            throw new RuntimeException(msg);
        }
        return msg+"test2";
    }
    @GetMapping("test3")
    public String test3(@RequestParam("msg")String msg){
        if(msg.length()<2){
            throw new RuntimeException(msg);
        }
        return msg+"port"+applicationContext.getEnvironment().getProperty("server.port");
    }
}
