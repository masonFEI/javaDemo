/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.example.demo;

import java.util.concurrent.TimeUnit;

/**
 * DeadLockDemo
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-05-29 14:08
 */

class Phone {

}


public class DeadLockDemo {


    public static void main(String[] args) {


        Phone a = new Phone();
        Phone b = new Phone();


        new Thread(() -> {
            synchronized (a) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (b) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }


        }, "t1").start();



        new Thread(() -> {
            synchronized (b) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (a) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }


        }, "t2").start();


    }


}
