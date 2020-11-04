package com.xjl.leetcode;

import java.util.ArrayList;

//57. 插入区间
public class Solution14 {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int left = newInterval[0];
        int right = newInterval[1];
        ArrayList<int[]>  list = new ArrayList<int[]> ();
        boolean flag = false;
        for (int[] arr : intervals){

            if (arr[0] > right){
                //在插入区间右侧且无交集
                if (!flag){
                    // 当找到了一个在右侧的，证明以后的所有区间都不会和插入区间有交集了
                    list.add(new int[]{left,right});
                    flag = true;
                }
                list.add(arr);
            } else if (arr[1] < left){
                //在插入区间左侧且无交集
                list.add(arr);
            } else {
                left = Math.min(arr[0], left);
                right = Math.max(arr[1],right );
            }
        }
        if (!flag) {
            list.add(new int[]{left,right});
        }
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;


    }
}
