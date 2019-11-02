package com.xjl.firstpage;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @描述: 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @作者: XUJIANLIN
 */
public class Solution03 {
    /**
     * 使用栈方法
     * @param Listnode
     * @return
     */
    public static ArrayList<Integer> printListFromTailToHead1(ListNode listnode){
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> out = new ArrayList<Integer>();

        while( listnode != null){
            stack.push(listnode.val);
            listnode = listnode.next;
        }
        while(!stack.empty()){
            out.add(stack.pop());

        }
        return out;
    }

    /**
     * 使用递归解决问题
     * @param listnode
     *
     */
    public static void printListFromTailToHead2(ListNode listnode){
        if (listnode == null){
            return ;
        }
        printListFromTailToHead2(listnode.next);
        System.out.println(listnode.val);

    }

    public static void main(String[] args) {
        ListNode listnode = new ListNode(1);
        listnode.next = new ListNode(2);
        listnode.next.next = new ListNode(3);
        listnode.next.next.next =  new ListNode(4);
        ArrayList<Integer> out = printListFromTailToHead1(listnode);
        for(Integer i :out){
            System.out.println(i);
        }
        printListFromTailToHead2(listnode);
    }

}
class ListNode{
    public Integer val;
    public ListNode next;

    ListNode(Integer val){
        this.val = val;
    }
}
