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
import org.junit.Test;

/**
 * HuTooLDemi
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-03-29 13:31
 */
public class HuTooLDemo {


    public static void main(String[] args) {


        String unicode = Convert.strToUnicode("字符串");
        Console.log(unicode);

        int second = DateUtil.timeToSecond("08:30");

        String time = DateUtil.secondToTime(500);

        System.out.println(second);

        System.out.println(time);
        String[] a = {"abc", "bcd"};

        Console.log(a);


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


