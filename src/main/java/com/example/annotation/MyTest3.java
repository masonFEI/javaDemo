package com.example.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) //当前被修饰的注解只能用在类
@Retention(RetentionPolicy.RUNTIME) // 控制下面的注解一直保留到运行时
public @interface MyTest3 {
}
