/**
 * LY.com Inc.
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package com.example.demo;

import lombok.AllArgsConstructor;

import java.util.*;

/**
 * SetDemo
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2025-11-12 11:37
 */
public class SetDemo {

    public static void main(String[] args) {

        Set<Animal> set = new HashSet<Animal>();

        Animal a = new Animal("a",1);
        Animal b = new Animal("b",2);
        Animal c = new Animal("c",3);

        List<Animal>  alist = new ArrayList<>();
        alist.add(a);
        alist.add(b);
        alist.add(c);

        set.addAll(alist);

        Animal d = new Animal("a",1);
        Animal e = new Animal("e",4);

        List<Animal>  blist = new ArrayList<>();
        blist.add(d);
        blist.add(e);
        set.addAll(blist);

        System.out.println(set.size());


    }


}

@AllArgsConstructor
class Animal{
    String name;
    Integer age;

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     * The {@code equals} method implements an equivalence relation
     * on non-null object references:
     * <ul>
     * <li>It is <i>reflexive</i>: for any non-null reference value
     *     {@code x}, {@code x.equals(x)} should return
     *     {@code true}.
     * <li>It is <i>symmetric</i>: for any non-null reference values
     *     {@code x} and {@code y}, {@code x.equals(y)}
     *     should return {@code true} if and only if
     *     {@code y.equals(x)} returns {@code true}.
     * <li>It is <i>transitive</i>: for any non-null reference values
     *     {@code x}, {@code y}, and {@code z}, if
     *     {@code x.equals(y)} returns {@code true} and
     *     {@code y.equals(z)} returns {@code true}, then
     *     {@code x.equals(z)} should return {@code true}.
     * <li>It is <i>consistent</i>: for any non-null reference values
     *     {@code x} and {@code y}, multiple invocations of
     *     {@code x.equals(y)} consistently return {@code true}
     *     or consistently return {@code false}, provided no
     *     information used in {@code equals} comparisons on the
     *     objects is modified.
     * <li>For any non-null reference value {@code x},
     *     {@code x.equals(null)} should return {@code false}.
     * </ul>
     * <p>
     * The {@code equals} method for class {@code Object} implements
     * the most discriminating possible equivalence relation on objects;
     * that is, for any non-null reference values {@code x} and
     * {@code y}, this method returns {@code true} if and only
     * if {@code x} and {@code y} refer to the same object
     * ({@code x == y} has the value {@code true}).
     * <p>
     * Note that it is generally necessary to override the {@code hashCode}
     * method whenever this method is overridden, so as to maintain the
     * general contract for the {@code hashCode} method, which states
     * that equal objects must have equal hash codes.
     *
     * @param obj the reference object with which to compare.
     * @return {@code true} if this object is the same as the obj
     * argument; {@code false} otherwise.
     * @see #hashCode()
     * @see HashMap
     */
    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Animal that = (Animal) o;
        return name.equals(that.name) && age.equals(that.age);
    }

    @Override
    public int hashCode() {
        // 用 Objects.hash() 简化计算，参数与 equals() 一致
        return Objects.hash(name, age);
    }
}