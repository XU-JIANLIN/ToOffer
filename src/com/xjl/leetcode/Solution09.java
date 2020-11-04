package com.xjl.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution09 {
    public static List<Integer> partitionLabels(String S) {

        // 双指针方法
        // 从头开始，先读取第一个字母 。
        // 从字符串末尾开始，当读取到和前面字符相等的时候吗，记录当前位置。
        // 继续读取第二个字符。 从字符串末尾开始读取，当读取到和前面一样的字符时，比较和当前记录的字符大小，小的话，保持原有的值，大的话，记录当前值
        List<Integer> list = new ArrayList<Integer>();
        int n = S.length();
        int cur = -1;
        int pre = 0;
        for (int i = 0; i < n; i++){

            for (int j = n - 1; j >= 0; j--){
                if (i == j && j > cur) {
                    cur = j;
                }
                if (i == cur) {
                    list.add(cur - pre + 1);
                    pre = cur + 1;
                    break;
                }
                if (S.charAt(i) == S.charAt(j)){
                    cur = j >cur?j:cur;
                    break;
                }

            }

        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(partitionLabels("zababcbacadefegdehijhklij"));
    }
}
