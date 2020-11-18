package com.xjl.leetcode;

/**
 * @author xujianlin
 * @version 1.0
 * @Description: 134. 加油站
 * @date 2020/11/18 15:59
 */
public class Solution17 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length - 1;
        // 循环遍历所有站点
        for (int i = 0; i <= n; i++) {
            int sumOfGas = 0; // 总共加的油
            int sumOfCost = 0; // 总共消费的油
            int count = 0;     // 记录能走过几个站点

            while (count < n) {
                int j = (i + count) % n;
                sumOfGas += gas[j];
                sumOfCost += cost[j];
                if (sumOfGas < sumOfCost) {
                    break;
                }
                count++;

            }
            if (count == n) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }
}
