/**
 * LY.com Inc.
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package com.example.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * MathDemo
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2025-10-30 16:39
 */
public class MathDemo {


    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00000000");

        long start = System.currentTimeMillis();
        for (int i = 1; i <= 58000 * 14; i++) {
            df.format(34.2223333445555567778888);
        }

        System.out.println("format:" + (System.currentTimeMillis() - start));


        start = System.currentTimeMillis();
        for (int i = 1; i <= 58000 * 14; i++) {
            new BigDecimal(34.2223333445555567778888)
                    .setScale(8, RoundingMode.HALF_UP) // 保留8位，四舍五入
                    .doubleValue();
        }
        System.out.println("BigDecimal:" + (System.currentTimeMillis() - start));

        double v = 0;
        start = System.currentTimeMillis();
        for (int i = 1; i <= 58000 * 14; i++) {
            v = Math.round(34.2223333445555567778888 * 100000000) / 100000000.0;
        }
        System.out.println("Math.round:" + (System.currentTimeMillis() - start));

        System.out.println(1);


        double v2 = (double) (1540 - 80) / 1540;
        System.out.println(v2);
    }

}