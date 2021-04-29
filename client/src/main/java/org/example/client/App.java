package org.example.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"org.example.client","org.example.feign"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"org.example.feign"})
@EnableCircuitBreaker
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class,args);
    }
}
