/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * CustomObject
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-04-08 10:06
 */
public class CustomObject {

    private String field1;
    private int field2;
    private int score;

    public CustomObject(String field1, int field2, int score) {
        this.field1 = field1;
        this.field2 = field2;
        this.score = score;
    }

    // Getters for field1, field2, and score
    public String getField1() { return field1; }
    public int getField2() { return field2; }
    public int getScore() { return score; }

    // Override toString method for better readability
    @Override
    public String toString() {
        return "CustomObject{field1='" + field1 + "', field2=" + field2 + ", score=" + score + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(field1, field2);
    }



    public static List<CustomObject> customDistinctWithHighestScore(List<CustomObject> objects) {
        Map<Integer, CustomObject> map = objects.stream()
                .collect(Collectors.toMap(
                        CustomObject::hashCode, // 使用hashCode()作为键
                        Function.identity(),
                        (a, b) -> a.getScore() < b.getScore() ? b : a // Keep the one with the higher score
                ));
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        List<CustomObject> objects = Arrays.asList(
                new CustomObject("A", 1, 10),
                new CustomObject("B", 2, 20),
                new CustomObject("A", 1, 5), // Duplicate based on field1 and field2, but lower score
                new CustomObject("C", 3, 30),
                new CustomObject("C", 3, 60),
                new CustomObject("C", 3, 80)
        );

        List<CustomObject> distinctObjects = customDistinctWithHighestScore(objects);
        distinctObjects.forEach(obj -> System.out.println(obj)); // Outputs a list with unique objects based on field1 and field2, and highest score
    }


}