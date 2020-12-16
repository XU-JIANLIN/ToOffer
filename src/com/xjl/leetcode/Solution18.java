package com.xjl.leetcode;

import java.util.Arrays;
import java.util.Random;

/**
 * 给定一个无序的数组，找出数组在排序之后，相邻元素之间最大的差值。
 *
 * @author xujianlin
 * @version 1.0
 * @date 2020/11/26 10:42
 */
public class Solution18 {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return 0;
        }
        // 进行冒泡排序
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        int max = 0;
        for (int i = 1; i < n; i++) {
            max = max >= nums[i] - nums[i - 1] ? max : nums[i] - nums[i - 1];
        }


        return max;
    }

    public int maximumGap1(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            max = max >= nums[i] - nums[i - 1] ? max : nums[i] - nums[i - 1];
        }

        return max;

    }

    public static void main(String[] args) throws InterruptedException {
        Solution18 solu = new Solution18();

        int[] arrs = new int[100000];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = (int) (Math.random() * 1000);
        }


        long start1 = System.currentTimeMillis();
        System.out.println(solu.maximumGap1(arrs));
        long end1 = System.currentTimeMillis();
        System.out.println("程序运行时间： "+(end1 - start1)+"ms");


        long start2 = System.currentTimeMillis();
        System.out.println(solu.maximumGap1(arrs));
        long end2 = System.currentTimeMillis();
        System.out.println("程序运行时间： "+(end2 - start2)+"ms");
    }

}
