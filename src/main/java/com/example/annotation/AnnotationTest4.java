package com.example.annotation;


import org.junit.Test;

import java.lang.annotation.Annotation;

public class AnnotationTest4 {

    @Test
    public void parseClass() {
        Class c = Demo.class;

        if (c.isAnnotationPresent(MyTest4.class)) {
            MyTest4 myTest4 = (MyTest4) c.getDeclaredAnnotation(MyTest4.class);

            System.out.println(myTest4.value());
            System.out.println(myTest4.aaa());
        }
    }

}
