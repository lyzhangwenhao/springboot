package com.tom.springboot;

import com.tom.springboot.entity.Person;
import com.tom.springboot.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot04ApplicationTests {

    @Autowired
    private Person person;
    @Test
    public void contextLoads() {
        System.out.println(person);
        System.out.println(123);
    }

    @Autowired
    ApplicationContext applicationContext;
    @Test
    public void personServiceTest(){
        boolean b = applicationContext.containsBean("personService");
        System.out.println(b);
    }

}
