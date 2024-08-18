package com.example.guava.map;

import com.google.common.collect.HashMultimap;

import java.util.Set;

public class MultimapDemo {


    public static void main(String[] args) {


        HashMultimap<Integer, Integer> integerIntegerHashMultimap = HashMultimap.<Integer, Integer>create();


        integerIntegerHashMultimap.put(1,1);
        integerIntegerHashMultimap.put(1,11);
        integerIntegerHashMultimap.put(1,12);

        integerIntegerHashMultimap.put(2,2);
        integerIntegerHashMultimap.put(2,21);
        integerIntegerHashMultimap.put(2,22);
        integerIntegerHashMultimap.put(2,23);

        integerIntegerHashMultimap.put(3,3);
        integerIntegerHashMultimap.put(3,31);
        integerIntegerHashMultimap.put(3,32);
        integerIntegerHashMultimap.put(3,33);
        integerIntegerHashMultimap.put(3,34);

        System.out.println(integerIntegerHashMultimap);

        Set<Integer> integers = integerIntegerHashMultimap.get(1);


    }

}
