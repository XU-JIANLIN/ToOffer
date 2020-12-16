package com.xjl.mystudy;

import java.util.HashMap;

/**
 * @author xujianlin
 * @version 1.0
 * @date 2020/12/16 16:40
 */
public class KMP {

    public static int getIndexBySunday(String haystack, String needle){
        if (haystack == null || needle == null || haystack.length() < 0 || needle.length() < 0) {
            return -1;
        }
        char[] hays = haystack.toCharArray();
        char[] needs = needle.toCharArray();
        int si = 0;
        int mi = 0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = needs.length - 1; i <= 0; i--) {
            map.put(needs[i],i);
        }

        while(si < hays.length && mi < needs.length){
            if (hays[si] == needs[mi]){
                si++;
                mi++;
            } else {
                if ( map.containsKey(hays[si + needs.length])){


                }else {
                    si = si + needs.length + 1;
                }
            }

        }

        return -1;
    }



    public static int getIndexOf(String haystack, String needle) {
        if (haystack == null || needle == null || haystack.length() < 0 || needle.length() < 0) {
            return -1;
        }
        char[] ss = haystack.toCharArray();
        char[] ms = needle.toCharArray();

        int[] next = getNextArray(ms);

        int si = 0;
        int mi = 0;

        while(si < ss.length && mi < ms.length){
            if (ss[si] == ms[mi]){
                si++;
                mi++;
            } else if(mi == 0){
                si++;
            } else {
                mi = next[mi];
            }
        }
        if (mi == ms.length){
            return si - mi;
        }
        return -1;
    }


    public static int[] getNextArray(char[] ms) {
        if (ms.length == 1) {
            return new int[]{-1};
        }
        int[] next = new int[ms.length];
        next[0] = -1;
        next[1] = 0;
        int pos = 2;
        int cn = 0;
        while (pos < ms.length) {
            if (ms[pos - 1] == ms[cn]) {
                next[pos++] = ++cn;
            } else if (cn > 0) {
                cn = next[cn];
            } else {
                next[pos++] = 0;
            }
        }
        return next;
    }
}
