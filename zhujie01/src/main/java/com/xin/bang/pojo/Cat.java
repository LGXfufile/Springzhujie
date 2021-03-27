package com.xin.bang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Component,意思就是把这个类给spring接管了，注册到了容器中；
@Component
public class Cat {
    private String name;
    public String getName() {
        return name;
    }
    @Value("xinxin")
    public void setName(String name) {
        this.name = name;
    }
}
