package com.xin.bang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class people {
    @Autowired
    private myDog dog;
    @Autowired
    private myCat cat;
    public String name;

    @Value("gougou")
    public myDog getDog() {
        return dog;
    }

    public void setDog(myDog dog) {
        this.dog = dog;
    }

    @Value("mimi")
    public myCat getCat() {
        return cat;
    }

    public void setCat(myCat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "people{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }
}
