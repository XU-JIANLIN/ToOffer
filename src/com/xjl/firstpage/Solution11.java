package com.xjl.firstpage;

/**
 * @描述: 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @作者: XUJIANLIN
 */
public class Solution11 {
    public static int NumberOf1(int n) {
        int count = 0;
        while(n!= 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }
    public static void main(String[] strings) {
        String a = new String("hello");
        String b = new String("hello");
        System.out.println(NumberOf1(2));
        System.out.println(2<<3);
        System.out.println(127==127);
        System.out.println(128==128);
        System.out.println(129==129);
        System.out.println(a==b);
        System.out.println(a.equals(b));


    }
}


