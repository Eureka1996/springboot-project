package com.wufuqiang.springboothelloworld;

import com.wufuqiang.springboothelloworld.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ author wufuqiang
 * @ date 2019/12/28/028 - 20:43
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootHelloworldApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc ;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads(){
        System.out.println(person);
        boolean isContain = ioc.containsBean("helloService");

        System.out.println("isContain----------------s:"+isContain);

    }

    @Test
    public void testLogging(){

        //日志级别
        logger.trace("这是trace日志");
        logger.debug("这是debug日志");
        logger.info("这是info日志");
        logger.warn("这是warn日志");
        logger.error("这是error日志");

    }
}
