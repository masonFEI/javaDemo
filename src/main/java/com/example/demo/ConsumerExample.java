/**
 * LY.com Inc.
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package com.example.demo;

import java.util.function.Consumer;

/**
 * ConsumerExample
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2025-02-17 15:24
 */
public class ConsumerExample {

    public static void main(String[] args) {
        // 创建一个 Consumer 实例，用于修改传入的字符串
        Consumer<StringBuilder> stringBuilderConsumer = sb -> sb.append(" Modified");

        StringBuilder sb = new StringBuilder("Original");
        // 调用 accept 方法处理参数
        stringBuilderConsumer.accept(sb);

        System.out.println(sb.toString());
    }

}