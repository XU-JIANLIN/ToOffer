package com.xjl.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class Solution08 {
    public static boolean isLongPressedName(String name, String typed) {
        if (name.equals(typed)) {
            return true;
        }
        // name有两个字母时，typed 不可能只有一个
        // 转化为， typed中的连续字母，不能少于name中的连续字母

            int j = 0;
            int i = 0;
            while(j < typed.length()) {
                if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                    i++;
                    j++;
                } else if ( j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                        j++;
                } else {
                    return false;
                }
            }


        return i == name.length();
    }

    public static void main(String[] args) {
        System.out.println(isLongPressedName("leelee","lleeelee"));
    }

}
