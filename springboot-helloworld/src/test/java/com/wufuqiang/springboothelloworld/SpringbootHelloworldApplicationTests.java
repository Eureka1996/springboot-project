package com.wufuqiang.springboothelloworld;

import com.wufuqiang.springboothelloworld.bean.Person;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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

    public void contextLoads(){
        System.out.println(person);
    }
}
