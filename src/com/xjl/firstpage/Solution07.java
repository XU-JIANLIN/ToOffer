package com.xjl.firstpage;

/**
 * @描述: 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 *          n<=39
 * @作者: XUJIANLIN
 */
public class Solution07 {
    public static int Fibonacci(int n) {
        int n1 = 0;
        int n2 = 1;
        int res = 0;
        if (n <= 1){
           return n;
        }
        for(int i =2; i<=n;i++){
            res = n1+n2;
            n1= n2;
            n2 =res;
        }
        return res;


    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(2));

    }



}
