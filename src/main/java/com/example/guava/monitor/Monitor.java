/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.guava.monitor;

import cn.hutool.core.thread.ThreadUtil;
import org.springframework.scheduling.concurrent.CustomizableThreadFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Monitor
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-07-29 19:56
 */
public class Monitor {


    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10, new CustomizableThreadFactory("MONITOR-"));

        MonitorRunner<Integer> monitorRunner = new MonitorRunner<>(0, x -> x > 10, () -> {
            System.out.println("今天天气真好");
        });
        executorService.submit(monitorRunner);

        while (monitorRunner.getParam() <= 10) {
            monitorRunner.setParam(monitorRunner.getParam() + 1);
            ThreadUtil.sleep(1000l);
            System.out.println("当前param的值:" + monitorRunner.getParam());
        }
        ThreadUtil.sleep(5000l);
        executorService.shutdown();


    }

}