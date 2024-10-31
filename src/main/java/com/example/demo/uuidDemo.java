/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.demo;

import java.util.UUID;

/**
 * uuidDemo
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-10-25 16:51
 */
public class uuidDemo {


    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid.toString());
        }

        long end = System.currentTimeMillis();
        long cha =  end  - start;

        System.out.println(cha/1000);

    }

}