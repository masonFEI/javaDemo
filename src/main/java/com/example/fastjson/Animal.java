package com.example.fastjson;

import com.alibaba.fastjson.annotation.JSONType;

//@JSONType(typeName = "animal", seeAlso = {Dog.class, Cat.class})
@JSONType(typeKey = "type")
public abstract class Animal {


    protected String name;

    protected int type;

    public Animal(String name,int type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return name;
    }

    public abstract void makeSound();


}
