package com.xin.bang;

import com.xin.bang.controller.people;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        people people = context.getBean("people", people.class);
//        System.out.println(people);
//        System.out.println(people.toString());
        people.getCat().jiao();
        people.getDog().jiao();
    }
}
