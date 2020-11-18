package com.xjl.leetcode;

import org.omg.CORBA.MARSHAL;

import java.util.*;

//973. 最接近原点的 K 个点
public class Solution15 {
    public static int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparingInt(o -> (o[0] * o[0] + o[1] * o[1])));
        return Arrays.copyOfRange(points, 0, K);
    }

    public static void main(String[] args) {
//        int[][] ints = {{3, 3}, {2, 2}, {2, 2}, {2, 2}, {2, 2}, {2, 2}, {1, 1}};
        int[][] ints = {{1, 3}, {-2, 2}};
//        System.out.println(kClosest(ints, 1));
        for (int[] test : kClosest(ints, 1)) {
            System.out.println(test[0] + "," + test[1]);
        }


    }
}
