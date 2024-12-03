/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.demo;

import java.util.Comparator;

/**
 * ComparisonContractViolation
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-12-02 19:43
 */
public class ComparisonContractViolation {

    public static void sort(Integer[] array, Comparator<Integer> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int comparison = comparator.compare(array[i], array[j]);
                if (!isContractSatisfied(comparison, array[i], array[j], comparator)) {
                    throw new IllegalArgumentException("Comparison method violates its general contract!");
                }
                if (comparison > 0) {
                    // 交换元素
                    Integer temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static boolean isContractSatisfied(int comparison, Integer a, Integer b, Comparator<Integer> comparator) {
        // 自反性：a.compareTo(a) 必须为 0
        if (comparator.compare(a, a) != 0) return false;

        // 反对称性：如果 a.compareTo(b) > 0，则 b.compareTo(a) 必须 < 0
        if (comparison > 0 && comparator.compare(b, a) > 0) return false;
        if (comparison < 0 && comparator.compare(b, a) < 0) return false;

        // 传递性检查
        if (comparison > 0 && (comparator.compare(b, b) != 0 || comparator.compare(a, b) <= 0)) return false;
        if (comparison < 0 && (comparator.compare(a, a) != 0 || comparator.compare(b, a) >= 0)) return false;

        return true;
    }

    public static void main(String[] args) {
        Integer[] numbers = {5, 3, 6, 2};
        Comparator<Integer> brokenComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 故意违反反对称性
                if (o1 == null) return 1;
                if (o2 == null) return -1;
                return o1 > o2 ? 1 : (o1 < o2 ? -1 : 0);
            }
        };

        try {
            sort(numbers, brokenComparator);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}