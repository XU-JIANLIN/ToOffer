package com.xjl.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

//给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。
// 例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
//
//
//
public class Solution03 {
    public static List<String> commonChars(String[] A) {
        int[] minsave = new int[26];
        Arrays.fill(minsave, Integer.MAX_VALUE);
        for (String word : A){
            int[] tmp = new int[26];
            for (int i = 0; i < word.length(); i++){
                ++tmp[ word.charAt(i) - 'a'];
            }

            for (int i = 0; i < 26; i++){
                minsave[i] = Math.min(minsave[i], tmp[i]);
            }
        }
        List ans = new ArrayList();
        for (int i = 0; i < 26; i++){
            for (int j = 0; j < minsave[i]; j++){
                ans.add(String.valueOf((char)(i + 'a')));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        PriorityQueue<Object> queue = new PriorityQueue<>();
        queue.add(19);
        queue.add(1);
        queue.add(34);
        queue.add(32);
        queue.add(23);
        queue.add(3);
        System.out.println(queue);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
//        String[] strings = new String[]{"bella","label","roller"};
//        System.out.println(commonChars(strings));
    }
}
