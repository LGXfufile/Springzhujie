package com.xin.bang.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//本身就是个Component，也会被spring托管，也会被注册到容器中；
//和我们之间的beans.xml是一个配置类；
@ComponentScan("com.xin.bang.pojo")//自动扫描标志；
public class People {

    @Bean //就相当于我们之前写的bean标签；
    //方法名字，就相当于之前的id标签；
    public Cat getCar(){
        return new Cat();
    }
}
