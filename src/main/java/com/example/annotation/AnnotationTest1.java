package com.example.annotation;

@MyTest1(aaa = "牛魔王", ccc = {"HTML", "Java"})
@MyTest2("孙悟空")
public class AnnotationTest1 {

    @MyTest1(aaa = "铁扇公主", bbb = false, ccc = {"Python", "前端", "Java"})
    public void test1() {

    }

}
