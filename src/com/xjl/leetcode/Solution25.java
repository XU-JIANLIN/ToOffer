package com.xjl.leetcode;

public class Solution25 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++){
            if(bills[i] > 5){
                if(five==0){
                    return false;
                }
                if(bills[i] == 10){
                    ten++;
                    five--;
                } else {
                    if(ten > 0) {
                        ten--;
                        five--;
                    } else{
                        if(five < 3){
                            return false;
                        }
                        five = five -3;
                    }
                }

            } else {
                five++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Solution25().lemonadeChange(new int[]{5,5,5,10,20});
    }
}