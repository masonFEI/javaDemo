/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.example.juc.threadpool;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 做一个线程池的demo，来看下核心线程都工作时，任务进入等待队列；再shutdown线程池，看队列的处理情况
 * 
 * 任务获取可以设置超时时间
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-09-11 11:28
 */
public class ThreadPoolExecutorDemo {

    public static void main(String[] args) {
        List<Callable<TaskResult>> myTasks = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            MyTask myTask = new MyTask();
            myTask.setIndex(String.valueOf(i));
            // 偶数任务不超时，奇数任务超时
            myTask.setSleepTime((i & 1) == 0 ? 1 : 5);
            myTasks.add(myTask);
        }

        ThreadPoolExecutor threadPoolExecutor = ThreadPoolUtils.initThreadPool();
        List<TaskResult> taskResults = ThreadPoolUtils.getTaskResultsWithTimeout(myTasks, threadPoolExecutor, 2, TimeUnit.SECONDS);

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("调用线程池shutdown");
        threadPoolExecutor.shutdown();

        System.out.println(taskResults);
    }

}

@Data
class TaskResult {

    private String       name;

    private List<String> numbers;
}

/**
 * 任务对象
 */
@Data
class MyTask implements Callable<TaskResult> {

    private String index;

    private int    sleepTime;

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public TaskResult call() throws Exception {
        System.out.println("start to do task " + index + ", need sleep " + sleepTime);

        try {
            TimeUnit.SECONDS.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        TaskResult taskResult = new TaskResult();
        taskResult.setName(index);
        taskResult.setNumbers(Arrays.asList(index, index + 1, index + 2));
        return taskResult;
    }
}
