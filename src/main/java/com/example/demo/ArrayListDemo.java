/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.example.demo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayListDemo
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-03-03 13:20
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        List<Scheme> list = new ArrayList<>();

        list.add(new Scheme(1,"a"));
        list.add(new Scheme(2,"b"));
        list.add(new Scheme(3,"c"));
        list.add(new Scheme(4,"d"));
        list.add(new Scheme(5,"e"));

        List<Scheme> schemes = list.subList(0, 2);

        schemes.get(0).setName("aaaa");
        System.out.println(schemes);
    }


    @Data
    public static class Scheme {
        private int id;
        private String name;

        public Scheme(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }


}
