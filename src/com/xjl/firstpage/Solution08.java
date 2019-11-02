package com.xjl.firstpage;

/**
 * @描述: 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * @作者: XUJIANLIN
 */
public class Solution08 {
    public static int JumpFloor1(int target) {
        int res = 1;
        int n1 = 1;
        int n2 = 1;
        for (int i=2; i<=target; i++){//从第2开始2还是1，所以初始化的时候把n1=0，n2=1
            //第三项开始是前两项的和,然后保留最新的两项，更新数据相加
            res = (n1 + n2);
            n1 = n2;
            n2 = res;
        }
        return res;
    }
    public static int JumpFloor2(int target){
        if(target<=2){
            return  target;
        }
        return JumpFloor2(target-1)+JumpFloor2(target-2);
    }

    public static void main(String[] args) {
        System.out.println(JumpFloor1(20));
        System.out.println(JumpFloor2(20));
    }
}
