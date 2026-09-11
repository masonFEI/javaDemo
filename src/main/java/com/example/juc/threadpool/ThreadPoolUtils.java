/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.example.juc.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * ThreadPoolUtils
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-09-11 14:08
 */
public class ThreadPoolUtils {

    /**
     * 初始化线程池
     *
     * @return
     */
    public static ThreadPoolExecutor initThreadPool() {
        return new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingDeque<>(15), Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.CallerRunsPolicy());
    }

    /**
     * 获取线程的执行结果，带超时时间的.每个future都会等待timeout的时间
     *
     * @param tasks
     * @param executor
     * @param timeout
     * @param unit
     * @return
     */
    public static <R> List<R> getTaskResults(List<Callable<R>> tasks, ThreadPoolExecutor executor, int timeout, TimeUnit unit) {
        List<R> results = new ArrayList<>();

        List<Future<R>> futureTasks = tasks.stream().map(executor::submit).collect(Collectors.toList());

        for (int i = 0; i < tasks.size(); i++) {
            Future<R> futureTask = futureTasks.get(i);
            Callable<R> myTask = tasks.get(i);
            try {
                R taskResult = futureTask.get(timeout, unit);
                results.add(taskResult);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            } catch (TimeoutException e) {
                System.out.println("timeout:" + myTask);
            }
        }

        return results;
    }

    /**
     * 获取线程的执行结果，带超时时间的.这个超时时间是这一批任务的总时间
     *
     * @param tasks
     * @param executor
     * @param timeout
     * @param unit
     * @return
     */
    public static <R> List<R> getTaskResultsWithTimeout(List<Callable<R>> tasks, ThreadPoolExecutor executor, int timeout, TimeUnit unit) {
        List<R> results = new ArrayList<>();

        try {
            List<Future<R>> futureTasks = executor.invokeAll(tasks, timeout, unit);
            for (int i = 0; i < tasks.size(); i++) {
                Future<R> futureTask = futureTasks.get(i);
                Callable<R> myTask = tasks.get(i);
                try {
                    R taskResult = futureTask.get();
                    results.add(taskResult);
                } catch (Exception e) {
                    System.out.println("Exception:" + myTask);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return results;
    }

}
