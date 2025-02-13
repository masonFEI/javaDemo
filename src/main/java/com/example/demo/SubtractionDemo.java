/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.demo;

/**
 * SubtractionDemo
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-12-03 20:08
 */
public class SubtractionDemo {


    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.3;

        // 进行一系列可能导致精度损失的运算
        for (int i = 0; i < 10000; i++) {
            a += 0.00001;
            b += 0.00001;
        }

        // 输出a - b和b - a的结果
        System.out.println("a - b: " + (a - b));
        System.out.println("b - a: " + (b - a));

    }


}