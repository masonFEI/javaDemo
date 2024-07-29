/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.guava.monitor;

import com.google.common.util.concurrent.Monitor;
import lombok.Getter;

import java.util.function.Function;

/**
 * MonitorRunner
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-07-29 19:58
 */
public class MonitorRunner<T> implements Runnable {


    @Getter
    private T param;

    private Function<T, Boolean> condition;

    private Runnable runnable;

    private Monitor monitor;


    /**
     * 构造函数
     *
     * @param param
     * @param condition
     * @param runnable
     */
    public MonitorRunner(T param, Function<T, Boolean> condition, Runnable runnable) {
        this.param = param;
        this.condition = condition;
        this.runnable = runnable;
        this.monitor = new Monitor();
    }


    @Override
    public void run() {
        System.out.println("线程开始");

        Monitor.Guard guard = new Monitor.Guard(monitor) {

            @Override
            public boolean isSatisfied() {
                return condition.apply(param);
            }
        };


        while (true) {
            if (monitor.enterIf(guard)) {
                try {
                    runnable.run();
                } finally {
                    monitor.leave();
                    break;
                }

            } else {
                continue;
            }
        }
    }

    public MonitorRunner<T> setParam(T param) {
        this.param = param;
        return this;
    }

}