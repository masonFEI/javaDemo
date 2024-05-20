package com.example.annotation;

public @interface MyTest2 {
    // 注解中只有一个value属性，使用注解时，value名称可以不写
    String value();

    int age() default 23;


}
