/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.annotation;

/**
 * MyClass
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-05-07 15:40
 */
public class MyClass {


    @MyCustomAnnotation(value = "hello,world")
    public void myMethod() {

    }

    @MyCustomAnnotation
    public void anotherMethod() {

    }


}