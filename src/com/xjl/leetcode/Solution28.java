package com.xjl.leetcode;

import java.util.HashMap;

/**
 * 290. 单词规律
 * @author xujianlin
 * @version 1.0
 * @date 2020/12/16 8:45
 */
public class Solution28 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        String[] split = s.split(" ");
        char[] chars = pattern.toCharArray();

        int m = chars.length;
        int n = split.length;
        if (m != n){
            return false;
        }

        for (int i = 0; i < m; i++) {
            char ch = chars[i];
            String str = split[i];
            if (map1.containsKey(ch)){
                if (!map1.get(ch).equals(str)){
                    return false;
                }
            }
            if (map2.containsKey(str)){
                if (!map2.get(str).equals(ch)){
                    return false;
                }
            }
            map1.put(ch,str);
            map2.put(str,ch);
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println();

        System.out.println(new Solution28().wordPattern("abba","dog dog dog dog"));
    }
}


