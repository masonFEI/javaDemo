/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.demo;


import com.google.common.collect.Lists;

import java.util.ArrayList;

/**
 * HuTooLDemi
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-03-29 13:31
 */
public class HuTooLDemo {


    public static void main(String[] args) {


        ArrayList<String> arrayList = Lists.newArrayList("1", "2", "3", "4", "5");

        System.out.println(arrayList.subList(0, 3));
        System.out.println(arrayList);


    }


}


