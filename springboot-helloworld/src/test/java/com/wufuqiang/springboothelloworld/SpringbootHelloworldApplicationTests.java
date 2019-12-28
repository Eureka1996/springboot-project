package com.wufuqiang.springboothelloworld;

import com.wufuqiang.springboothelloworld.bean.Person;
import com.wufuqiang.springboothelloworld.service.HelloService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringbootHelloworldApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {

//        HelloService helloService = (HelloService)ioc.getBean("helloService");
//        System.out.println(helloService);
        logger.trace("wufuqiang trace");
        logger.debug("wufuqiang debug");
        logger.info("wufuqiang info");
        logger.warn("wufuqiang warn");
        logger.error("wufuqiang error");


        System.out.println("ioc中包含helloService:"+ioc.containsBean("helloService"));
        System.out.println(person);
    }

}
