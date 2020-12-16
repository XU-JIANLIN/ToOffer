package com.xjl.leetcode;

import java.util.*;

/**
 * @author xujianlin
 * @version 1.0
 * @date 2020/12/14 16:53
 */
public class Solution27 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        ArrayList<List> reList = new ArrayList<>();
        for (String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!map.containsKey(key)){
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }else {
                List<String> list = map.get(key);
                list.add(str);
                map.put(key, list);
            }
        }
        return new ArrayList<List<String>>(map.values());

    }

    

        

}
