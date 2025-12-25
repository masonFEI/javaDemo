/**
 * LY.com Inc.
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package com.example.demo;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * HeapDemo
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2025-12-23 17:26
 */
public class HeapDemo {


    public static void main(String[] args) {


        Map<String, List<String>> relateSchemesMap = new HashMap<String, List<String>>() {
            {
                put("1", Lists.newArrayList("d", "e"));
                put("2", Lists.newArrayList("f", "g"));
            }
        };

        List<String> list = new ArrayList<>();

        list.addAll(relateSchemesMap.get("1"));
        list.addAll(relateSchemesMap.get("3"));


        List<String> defaults = Lists.newArrayList("a", "b", "c");


        Map<String, List<String>> map = new HashMap<String, List<String>>() {
            {
                put("1", Lists.newArrayList("d", "e"));
                put("2", Lists.newArrayList("f", "g"));
            }
        };

        SchemesGroup group = new SchemesGroup();
        group.setDefaultSchemes(defaults);
        group.setDirectRelateSchemesMap(map);

        List<String> needSchemes = group.getDefaultSchemes();

        needSchemes.add("h");
        needSchemes.add("i");
        needSchemes.add("j");

        System.out.println(needSchemes);
    }


    // ------------------------------------------内部类------------------------------------------

    /**
     * 根据类型，分类后的方案
     */
    @Data
    protected static class SchemesGroup {

        /**
         * 默认品类的方案
         */
        private List<String> defaultSchemes;

        /**
         * 【与直达相关的品类】的方案
         */
        private List<String> directRelateSchemes;

        /**
         * 直达车次key->中转方案列表
         */
        private Map<String, List<String>> directRelateSchemesMap;
    }

}
