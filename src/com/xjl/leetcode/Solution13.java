package com.xjl.leetcode;


//941. 有效的山脉数组
public class Solution13 {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3){
            return false;
        }
        int i = 0;
        while(i + 1 < A.length && A[i] < A[i + 1]){
            i++;
        }
        if (i == A.length - 1 || i == 0){
            return false;
        }
        for (; i < A.length; i++){
            if (i + 1 < A.length && A[i] <= A[i + 1]){
                return false;
            }
        }
        return true;

    }
}
