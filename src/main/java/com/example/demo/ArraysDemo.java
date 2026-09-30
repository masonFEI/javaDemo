/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.example.demo;

import java.util.Arrays;

/**
 * ArraysDemo
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-09-30 15:35
 */
public class ArraysDemo {

    public static void main(String[] args) {
        String[] strings = { "aa", "bb", "cc" };

        Arrays.sort(strings);
        Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);

    }

}
