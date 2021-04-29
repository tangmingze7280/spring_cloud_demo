package org.example.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication(scanBasePackages = {"org.example"})
public class App {
    public static void main( String[] args ) {
       try{
           SpringApplication.run(App.class, args);

       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
