package com.example.fastjson;

import com.alibaba.fastjson.annotation.JSONType;

//@JSONType(typeName = "cat")

public class Cat extends Animal {

    public Cat(String name, int type) {
        super(name, type);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says Meow!");
    }

}
