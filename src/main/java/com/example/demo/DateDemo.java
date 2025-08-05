/**
 * LY.com Inc.
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package com.example.demo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

/**
 * DateDemo
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2025-08-05 21:15
 */
public class DateDemo {


    private static final Random RANDOM = new Random();

    /**
     * 生成指定年份范围内的随机日期
     * @param startYear 起始年份（包含）
     * @param endYear 结束年份（包含）
     * @return 随机LocalDate对象
     */
    public static LocalDate generateRandomDate(int startYear, int endYear) {
        // 生成随机年份
        int year = startYear + RANDOM.nextInt(endYear - startYear + 1);

        // 生成随机月份（1-12）
        int month = 1 + RANDOM.nextInt(12);

        // 根据年月生成当月最大天数
        LocalDate temp = LocalDate.of(year, month, 1);
        int maxDay = temp.lengthOfMonth();

        // 生成随机天数（1-当月最大天数）
        int day = 1 + RANDOM.nextInt(maxDay);

        return LocalDate.of(year, month, day);
    }

    public static void main(String[] args) {
        // 1. 演示随机生成日期
        System.out.println("随机生成5个日期：");
        for (int i = 0; i < 5; i++) {
            LocalDate randomDate = generateRandomDate(2000, 2025);
            System.out.println(randomDate);
        }

        // 2. 性能测试：20万次随机日期差计算
        int loopCount = 200_000;
        long start = System.nanoTime();

        for (int i = 0; i < loopCount; i++) {
            // 生成两个随机日期（2000-2025年之间）
            LocalDate date1 = generateRandomDate(2000, 2025);
            LocalDate date2 = generateRandomDate(2000, 2025);

            // 计算天数差
            ChronoUnit.DAYS.between(date1, date2);
        }

        long end = System.nanoTime();
        double costSeconds = (end - start) / 1_000_000_000.0;
        System.out.println("\n20万次随机日期生成+天数差计算耗时：" + costSeconds + " 秒");
        System.out.println("平均每次操作耗时：" + (end - start) / loopCount + " 纳秒");
    }

}