package com.xjl.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author xujianlin
 * @version 1.0
 * @date 2020/12/2 14:42
 */
public class Solution22 {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        int maxcount = 0;
        int[] maxNums = new int[k];

        // 先找出每个数组的最大子序列，
        int start = Math.max(0, k - n);
        int end = Math.min(m, k);
        for (int i = start; i <= end; i++) {
            //数组1 的最大子序列
            int[] maxNums1 = merge(nums1, i);
            //数组2 的最大子序列
            int[] maxNums2 = merge(nums1, k - i);
            // 得出最大的值
            int[] curr = getMax(maxNums1, maxNums2);
            int currcount = 0;
            for (int j = 0; j < curr.length; j++) {
                currcount += curr[j];
            }
            if (maxcount < currcount) {
                System.arraycopy(curr, 0, maxNums, 0, k);

            }
        }
        return maxNums;
    }

    private int[] getMax(int[] maxNums1, int[] maxNums2) {
        if (maxNums1.length == 0) {
            return maxNums2;
        }
        if (maxNums2.length == 0) {
            return maxNums1;
        }
        int mergeLength = maxNums1.length + maxNums2.length;
        int[] res = new int[mergeLength];
        int index1 = 0, index2 = 0;

        for (int i = 0; i < mergeLength; i++) {
            if (maxNums1[index1] > maxNums2[index2]) {
                res[i] = maxNums1[index1++];
            } else {
                res[i] = maxNums2[index2++];
            }
        }
        return res;

    }

    // 求数组nums 长度为 k 的最大子序列
    private int[] merge(int[] nums, int k) {
        int length = nums.length;
        // 建立单调栈
        int[] stack = new int[k];
        int top = -1;

        // 记录数组目前还剩多少个数可以取
        int remain = length - k;
        for (int i = 0; i < length; i++) {

            int num = nums[i];
            while (top >= 0 && stack[top] < num && remain > 0) {
                top--;
                remain--;
            }
            if (top < k - 1) {
                stack[++top] = nums[i];
            } else {
                remain--;
            }

        }
        return stack;


    }

    public static void main(String[] args) {

    }

}
