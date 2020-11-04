package com.xjl.leetcode;

public class Solution01 {

    public static void main(String[] args) {
       for ( int i = -100; i<1000; i++ ){
          int sum1 = 2*i*(i+2);
          int sum2 = (i - 1)* (i + 3);
          if (sum1 - sum2 < 0){
              System.out.println("1111");
              break;
          }

       }
    }
}
