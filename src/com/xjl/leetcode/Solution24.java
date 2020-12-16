package com.xjl.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author xujianlin
 * @version 1.0
 * @date 2020/12/9 9:09
 */
public class Solution24 {
    public int uniquePaths(int m, int n) {

        // (m - 1)!
        int x = 1;
        int county =1;
        int y = m + n -2;
        for(int i = m -1; i >= 1; i--){
            x *= i;
            county *= y--;
        }

        return (int)county / x;

    }
//    public int help(int m, int n, int count) {
//        if (m == 1 || n == 1) {
//            return 1;
//        }
//
//        count += help(m -1,n,count) + help(m, n-1, count);
//
//        return count;
//
//    }



    public static void main(String[] args) {
//        System.out.println(new Solution24().uniquePaths(7,3));
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for (int i = 10; i > 0; i--) {
            queue.add(i);
        }
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
