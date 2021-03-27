package com.xin.bang;


import com.xin.bang.pojo.Cat;
import com.xin.bang.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mytest {

    public static void main(String[] args) {
        //如果完全使用了配置类方法，只能用AnnotationConfigApplicationContext来获取容器；
        ApplicationContext context = new AnnotationConfigApplicationContext(People.class);
        Cat getCar = context.getBean("getCar", Cat.class);
        System.out.println(getCar.getName());


    }
}
