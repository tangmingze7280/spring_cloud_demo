package org.example.client.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@SuppressWarnings("all")
public class TestOtherService {
    @Autowired(required = false)
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public String t1(String msg){
        return  restTemplate.getForObject("http://MY-SERVER-1/test/test2?msg="+msg,String.class);
    }

    public String fallbackMethod(String msg){
        return "default_value";
    }
}
