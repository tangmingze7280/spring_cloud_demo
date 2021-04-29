package org.example.feign;

import org.example.feign.back.TestCallBack;
import org.example.feign.back.TestCallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "MY-SERVER-1",fallbackFactory = TestCallBackFactory.class)
public interface TestService {
    @RequestMapping(value = "/test/test1",method = RequestMethod.GET)
    String test1(@RequestParam("msg")String msg);
    @RequestMapping(value = "/test/test2",method = RequestMethod.GET)
    String test2(@RequestParam("msg")String msg);
}
