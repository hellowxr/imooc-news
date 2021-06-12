package com.wxr.user.controller;

import com.wxr.api.controller.user.HelloControllerApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloControllerApi {

    @Override
    public Object hello() {
        return "hello world";
    }
}
