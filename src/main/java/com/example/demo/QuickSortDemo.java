/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.example.demo;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * QuickSortDemo
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-05-21 17:31
 */
public class QuickSortDemo {


    public static void main(String[] args) {
        List<Integer> nums = Lists.newArrayList(5, 2, 6, 3, 8, 1, 4, 9);

        quickSortStep(nums, 0, nums.size() - 1);

        System.out.println(nums);
    }


    private static void quickSortStep(List<Integer> nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = nums.get(left);
        int loopLeft = left;
        int loopRight = right;

        // 0,从右开始；1，从左开始
        int flag = 0;

        while (loopLeft < loopRight) {
            // 从右开始
            if (flag == 0) {
                if (nums.get(loopRight) > pivot) {
                    loopRight--;
                    continue;
                }

                nums.set(loopLeft, nums.get(loopRight));
                flag = 1;
            }

            // 翻转，从左开始
            if (flag == 1) {
                if (nums.get(loopLeft) < pivot) {
                    loopLeft++;
                    continue;
                }

                nums.set(loopRight, nums.get(loopLeft));
                flag = 0;
            }
        }

        nums.set(loopLeft, pivot);

        quickSortStep(nums, left, loopLeft - 1);
        quickSortStep(nums, loopLeft + 1, right);

    }


}
