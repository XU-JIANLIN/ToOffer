package com.xjl.leetcode;

import java.util.HashSet;

public class Solution12 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet res = new HashSet<>();
        for (int i = 0; i < nums1.length; i++){
           set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++){
            if (set.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }

        int[] result = new int[res.size()];
        Object[] objects = res.toArray();

        for (int i = 0; i < objects.length; i++){
            result[i] = (int)objects[i];

        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = new int[] {};
        int[] nums2 = new int[] {};

        for (int i: intersection(nums1,nums2)){
            System.out.println(i);
        }

    }
}
