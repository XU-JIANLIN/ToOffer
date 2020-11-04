package com.xjl.leetcode;

//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
//
//注意：答案中不可以包含重复的三元组。

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution02 {
    public static List<List<Integer>> threeSum(int[] nums) {

        ArrayList<List<Integer>> lists = new ArrayList<>();

        // 先将数组进行排序
        Arrays.sort(nums);

        // 重点在于三重循环的简化
        for (int first = 0; first < nums.length; ++first){
            // 判断是否和上一个元素重复，重复不进行循环
            if (first > 0 && nums[first] == nums[first - 1]){
                continue;
            }
            int third = nums.length - 1;
            int target = -nums[first];
            for (int second = first + 1; second < nums.length; ++second){
                // 判断是否和上一个元素重复，重复不进行循环
                if (second > first + 1 && nums[second] == nums[second - 1]){
                    continue;
                }
                while (second < first && nums[second] + nums[third] > target) {
                    --third;
                }
                if (second == third){
                    break;
                }
                if (nums[first] + nums[second] + nums[third] == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    lists.add(list);
                }
            }


        }


        return lists;


    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] ints = {0, 0, 0, 0};
        System.out.println(threeSum(ints));

        long end = System.currentTimeMillis();
        System.out.println("共耗时"+(end-start)+"毫秒");
    }



}


