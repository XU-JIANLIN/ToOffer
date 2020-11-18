package com.xjl.leetcode;

import java.util.Arrays;

public class Solution16 {
    public static void nextPermutation(int[] nums) {

        if (!getSort(nums)) {
            Arrays.sort(nums);
        }

    }

    public static boolean getSort(int[] nums) {
        int n = nums.length - 1;
        for (int j = n; j >= 0; j--) {
            for (int i = j; i < nums.length; i++) {
                if (i + 1 < nums.length && nums[i] < nums[i + 1]) {
//                swap(i,i-1,nums);
                    int tmp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tmp;
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        nextPermutation(ints);
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
