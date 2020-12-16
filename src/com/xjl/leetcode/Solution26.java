package com.xjl.leetcode;

import java.util.LinkedList;
import java.util.Queue;

class Solution26 {
    public String predictPartyVictory(String senate) {

        int n = senate.length();
        Queue<Integer> radiant = new LinkedList<Integer>();
        Queue<Integer> dire = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R'){
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }
        while(!radiant.isEmpty() && !dire.isEmpty()) {
            int radintIndex = radiant.poll();
            int direIndex = dire.poll();
            if (radintIndex < direIndex){
                radiant.offer(radintIndex + n);
            } else {
                dire.offer(direIndex + n);
            }
        }
        return !radiant.isEmpty() ? "Radiant" : "Dire";

    }
}