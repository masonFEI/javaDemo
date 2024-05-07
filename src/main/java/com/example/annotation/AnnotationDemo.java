/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.annotation;

import java.lang.reflect.Method;

/**
 * AnnotationDemo
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-05-07 15:42
 */
public class AnnotationDemo {


    public static void main(String[] args) {
        try {

            Class<MyClass> obj = MyClass.class;

            for (Method method : obj.getDeclaredMethods()) {
                if (method.isAnnotationPresent(MyCustomAnnotation.class)) {
                    MyCustomAnnotation myAnnotation = method.getAnnotation(MyCustomAnnotation.class);

                    System.out.println("Method:" + method.getName());
                    System.out.println("Value:" + myAnnotation.value());

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}