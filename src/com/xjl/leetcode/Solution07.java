package com.xjl.leetcode;

import java.util.Stack;

public class Solution07 {
    public static boolean backspaceCompare(String S, String T) {

        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        for (int i = 0; i < S.length(); i++){
            if (S.charAt(i) != '#') {
                stack1.push(S.charAt(i));
            } else {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }

            }
        }
        for (int i = 0; i < T.length(); i++){
            if (T.charAt(i) != '#') {
                stack2.push(T.charAt(i));
            } else {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            }
        }

        while(!stack1.isEmpty() && !stack2.isEmpty() ) {
            if (!stack1.pop().equals(stack2.pop())){
                return false;
            }
        }
        if (stack1.isEmpty() && stack2.isEmpty()){
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println('a' == 'a');


        System.out.println(backspaceCompare(  "bxj##tw",  "bxj###tw"));
    }
}
