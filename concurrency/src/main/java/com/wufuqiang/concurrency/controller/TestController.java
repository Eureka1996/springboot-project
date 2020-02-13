package com.wufuqiang.concurrency.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ author wufuqiang
 **/
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
