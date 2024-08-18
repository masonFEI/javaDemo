package com.example.guava.map;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class BiMapDemo {


    public static void main(String[] args) {


        HashBiMap<Integer, String> objectObjectHashBiMap = HashBiMap.create();
        objectObjectHashBiMap.put(1,"java");
        objectObjectHashBiMap.put(2,"php");

        String s = objectObjectHashBiMap.get(1);

        Integer java = objectObjectHashBiMap.inverse().get("java");


    }

}
