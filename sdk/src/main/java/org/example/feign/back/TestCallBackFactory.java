package org.example.feign.back;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.example.feign.TestService;
import org.springframework.stereotype.Component;

@Component
public class TestCallBackFactory implements FallbackFactory<TestService> {
    @Override
    public TestService create(Throwable throwable) {
        return new TestService() {
            @Override
            public String test1(String msg) {
                return "1";
            }

            @Override
            public String test2(String msg) {
                return "2";
            }
        };
    }
}
