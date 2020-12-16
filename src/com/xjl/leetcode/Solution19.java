package com.xjl.leetcode;

import java.util.HashMap;

/**
 * 454. 四数相加 II
 * @author xujianlin
 * @version 1.0
 * @date 2020/11/27 16:32
 */
public class Solution19 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int tmp = A[i] + B[j];
                // 已存在
                if (map.containsKey(tmp)){
                    map.put(tmp, map.get(tmp) + 1);
                }else {
                    map.put(tmp,1);
                }
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int tmp = -(C[i] + D[j]);
                if (map.containsKey(tmp)){
                    res += map.get(tmp);
                }
            }

        }

        return res;

    }
}
