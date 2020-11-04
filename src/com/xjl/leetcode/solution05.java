package com.xjl.leetcode;


import java.util.Arrays;

//给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
//
public class solution05 {
    public int[] sortedSquares(int[] A) {
        for(int i = 0; i < A.length; i++) {

            A[i] = (int)Math.pow(new Double(A[i]), 2);
        }
        Arrays.sort(A);
        return A;
    }
    public int[] sortedSquares1(int[] A) {

        int n = A.length;
        int[] ans = new int[A.length];

        for (int i = 0, j = n - 1, pos = n - 1; i <= j;){
            if (A[i] * A[i] > A[j] * A[j]){
                ans[pos] = A[i] * A[i];
                i++;
            } else {
                ans[pos] = A[j] * A[j];
                j--;
            }
            pos--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr =new int[5][8];
        arr[1][2] = 1;
        System.out.println(arr.toString());

    }
}
