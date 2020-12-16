package com.xjl.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 659. 分割数组为连续子序列
 *
 * @author xujianlin
 * @version 1.0
 * @date 2020/12/4 13:42
 */
public class Solution23 {
    public boolean isPossible(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<Integer, PriorityQueue<Integer>>();

        for (int x : nums) {
            if (!map.containsKey(x)) {
                map.put(x, new PriorityQueue<Integer>());
            }
            // 包含 x -1 子序列
            if (map.containsKey(x - 1)) {
                Integer length = map.get(x - 1).poll();
                if (map.get(x - 1).isEmpty()) {
                    map.remove(x - 1);
                }
                map.get(x - 1).offer(length + 1);
            } else {
                map.get(x - 1).offer(1);
            }

        }

        Set<Map.Entry<Integer, PriorityQueue<Integer>>> entries = map.entrySet();
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : entries){
            PriorityQueue<Integer> queue = entry.getValue();
            while(!queue.isEmpty()){
                if (queue.poll() < 3){
                    return false;
                }
            }
        }
        return true;
    }
}
