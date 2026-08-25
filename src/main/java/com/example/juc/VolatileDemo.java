/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.example.juc;

import java.util.concurrent.TimeUnit;

/**
 * VolatileDemo
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-08-25 16:08
 */

public class VolatileDemo {

    private static volatile int    flag = 0;
    private static volatile String name = "johnny";

    public static void main(String[] args) {

        new Thread(() -> {
            int threadFlag = flag;
            String threadName = name;

            System.out.println("1-----flag值为：" + threadFlag);
            System.out.println("1-----name值为：" + threadName);

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("2-----flag值为：" + threadFlag);
            System.out.println("2-----name值为：" + threadName);

            System.out.println("4-----flag值为：" + flag);
            System.out.println("4-----name值为：" + name);
        }, "AA").start();

        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            flag = 3;
            name = "mason";

            System.out.println("3-----flag值为：" + flag);
            System.out.println("3-----name值为：" + name);
        }, "BB").start();

    }

}
