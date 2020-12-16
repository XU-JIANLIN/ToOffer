package com.xjl.leetcode;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 * @author xujianlin
 * @version 1.0
 * @date 2020/12/1 9:00
 */
public class Solution21 {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length < 0){
            return new int[]{-1,-1};
        }

        int start = -1;
        int end = -1;
        int left =0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] >= target){
                right = mid - 1;
                start = mid;
            }else {
                left = mid + 1;
            }
        }
        end = start;

        while (nums[end] == target ){
            end++;
        }






        return new int[]{start,end - 1};
    }



    public int binarySearch(int target, int[] nums){
        int left =0;
        int right = nums.length - 1;
        int res = 0;
        while(left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] >= target){
                right = mid - 1;
                res = mid;
            }else {
                left = mid + 1;
            }
        }
        return res;



    }

    public static void main(String[] args) {
        int[] ints = new Solution21().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        for (int i :ints) {
            System.out.println(i);
        }


        System.out.println(new Solution21().binarySearch(8,new int[]{5, 7, 7, 8, 8, 10}));
    }
}
