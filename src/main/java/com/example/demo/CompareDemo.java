/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.demo;

import java.util.*;

/**
 * CompareDemo
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-12-02 16:18
 */
public class CompareDemo {


    public static void main(String[] args) {

        List<BaseTransferBO> transferBOS = new ArrayList<>();

        // 创建对象时，设置一些初始值
        BaseTransferBO a = new BaseTransferBO(10, 200, "10:20");
        BaseTransferBO b = new BaseTransferBO(10, 200, "09:20:01");
        BaseTransferBO c = new BaseTransferBO(10, 200, "09-20:01");
        BaseTransferBO d = new BaseTransferBO(10, 800, "10:20");
        BaseTransferBO e = new BaseTransferBO(10, 800, "08:20:01");

        transferBOS.add(a);
        transferBOS.add(b);
        transferBOS.add(c);
        transferBOS.add(d);
        transferBOS.add(e);

        transferBOS.sort(MODEL_FIRST);

        System.out.println(transferBOS);

    }



    private static final Comparator<BaseTransferBO> MODEL_FIRST = (b1, b2) -> {
        if (b1.getScore() > b2.getScore()) {
            return 1;
        } else if (b1.getScore() < b2.getScore()) {
            return -1;
        } else {
            int totalTimeDelta = b1.getTotalTime() - b2.getTotalTime();
            if (totalTimeDelta == 0) {
                return b1.getFirstFromTime().compareTo(b2.getFirstFromTime());
            } else {
                return totalTimeDelta;
            }
        }
    };


}