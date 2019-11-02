package com.xjl.firstpage;

/**
 * @描述: 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @作者: XUJIANLIN
 */
public class Solution09 {
    public static int JumpFloorII(int target) {

        if (target <= 0)
            return 0;
        if (target == 1)
            return 1;
        /* 返回 fn=  f(n-1)+f(n-2)+.....f(n-n)


         */
        return 2 * JumpFloorII(target - 1);


    }

    public static void main(String[] args) {
        System.out.println(JumpFloorII(20));

    }
}
