package com.example.fastjson;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;

//@JSONType(typeName = "dog")

public class Dog extends Animal {

    public Dog(String name,int type) {
        super(name,type);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says Woof!");
    }

}
