package com.example.annotation;

public @interface MyTest1 {


    String aaa();

    boolean bbb() default false;

    String[] ccc();

}
