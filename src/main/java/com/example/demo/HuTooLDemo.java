/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.demo;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.db.ds.DSFactory;
import cn.hutool.setting.Setting;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * HuTooLDemi
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-03-29 13:31
 */
public class HuTooLDemo {


    public static void main(String[] args) {


        List<Integer> list = Lists.newArrayList(2, 3, 7, 8, 6, 5, 4);


        doSort(list);


        System.out.println(list);

//        String unicode = Convert.strToUnicode("字符串");
//        Console.log(unicode);
//
//        int second = DateUtil.timeToSecond("08:30");
//
//        String time = DateUtil.secondToTime(500);
//
//        System.out.println(second);
//
//        System.out.println(time);
//        String[] a = {"abc", "bcd"};
//
//        Console.log(a);


    }


    private static void doSort(List<Integer> list ) {
        list.sort(Comparator.comparingInt(Convert::toInt));
    }


    @Test
    public void dbDemo() {
        Setting setting = new Setting();

        DSFactory.create(setting);
    }

    @Test
    public void cryptoDemo() {
        byte[] bytes = DigestUtil.md5("1234567890123456789012345678901");
    }

}


