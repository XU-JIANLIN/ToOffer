package com.xjl.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * 1207. 独一无二的出现次数
 */
public class Solution10 {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List list  = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                Integer flag = map.get(arr[i]);
                map.put(arr[i], ++flag);
            } else {
                map.put(arr[i], 1);
                list.add(arr[i]);
            }
        }
        HashSet set = new HashSet();
        for (int i = 0; i < list.size(); i++){
            if (set.contains(map.get(list.get(i)))) {
                return false;
            } else {
                set.add(map.get(list.get(i)));
            }

//            for (int j = 0; j < list.size(); j++) {
//                if ( i != j && map.get(list.get(i)) == map.get(list.get(j))) {
//                    return false;
//                }
//            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2};
        System.out.println(uniqueOccurrences(arr));
    }
}
