package org.example.feign.back;

import org.example.feign.TestService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TestCallBack implements TestService{
    @Override
    public String test1(String msg) {
        return "hi, sorry, service is not used.";
    }

    @Override
    public String test2(String msg) {
        return "test2";
    }
}
