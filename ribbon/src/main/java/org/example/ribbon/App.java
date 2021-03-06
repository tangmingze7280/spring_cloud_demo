package org.example.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication(scanBasePackages = "org.example.ribbon")
@EnableDiscoveryClient
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean//向程序的ioc注入一个bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    @RestController
    @RequestMapping("tc")
    class TController{
        @GetMapping("t1")
        public String t1(@RequestParam("msg")String msg){
            return restTemplate().getForObject("http://MY-SERVER-1/test/test3?msg="+msg,String.class);
        }
    }
}
