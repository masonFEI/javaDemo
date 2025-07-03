/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.demo;



/**
 * HuTooLDemi
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-03-29 13:31
 */
public class HuTooLDemo {


    public static void main(String[] args) {

        int end = 10;
        int maxCount = 5;

        for (int i = end - 1, j = maxCount; i >= 0 && j > 0; i--, j--) {
            System.out.println(i);
            System.out.println(j);
        }

        System.out.println(maxCount);

    }


}


