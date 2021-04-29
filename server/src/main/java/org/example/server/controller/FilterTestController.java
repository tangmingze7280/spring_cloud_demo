package org.example.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("filt")
public class FilterTestController {
    @RequestMapping("t1")
    public String t1(){
        return "tititit";
    }
}
