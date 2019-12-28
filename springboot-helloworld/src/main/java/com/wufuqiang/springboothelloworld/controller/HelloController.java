package com.wufuqiang.springboothelloworld.controller;

import com.wufuqiang.springboothelloworld.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    Person person;

    @Value("${person.lastName:默认值}")
    String name;

    @RequestMapping("/hello")
    public String hello(){
//        return "Hello "+name;
        return person.toString();
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("name","<h1>wufuqiang</h1>");
        map.put("users", Arrays.asList("wfq","Mr. Wu"));
        return "SUCCESS";
    }

}
