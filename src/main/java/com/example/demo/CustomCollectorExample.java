package com.example.demo;

import com.example.demo.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomCollectorExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Alice", 28),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        // 使用 collectingAndThen 收集器来收集 Person 对象
        // 首先收集到列表，然后对每个人进行年龄增加10岁的处理
        List<Person> agedPeople = people.stream()
                .distinct().collect(Collectors.collectingAndThen(
                        Collectors.toList(), // 收集到列表
                        list -> {
                            list.forEach(person -> person.setAge(person.getAge() + 10)); // 对每个人年龄增加10岁
                            return list; // 返回处理后的列表
                        }
                ));

        // 输出结果
        agedPeople.forEach(System.out::println);
    }
}