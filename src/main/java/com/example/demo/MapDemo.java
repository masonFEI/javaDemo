/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.example.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * MapDemo
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-03-03 13:28
 */
public class MapDemo {


    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        map1.putAll(map2);
        System.out.println(map1);
    }

}
