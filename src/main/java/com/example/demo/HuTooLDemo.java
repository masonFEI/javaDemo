/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.demo;

import cn.hutool.core.date.DateUtil;

/**
 * HuTooLDemi
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-03-29 13:31
 */
public class HuTooLDemo {


    public static void main(String[] args) {
        int second = DateUtil.timeToSecond("08:30");

        String time = DateUtil.secondToTime(500);

        System.out.println(second);


        System.out.println(time);

    }

}


