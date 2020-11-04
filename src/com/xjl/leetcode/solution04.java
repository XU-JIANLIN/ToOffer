package com.xjl.leetcode;

import java.util.PriorityQueue;

//116. 填充每个节点的下一个右侧节点指针
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
public class solution04 {
    public Node connect(Node root) {
        if (root == null || root.left == null ){
            return root;
        }
        root.left.next = root.right;
        changeNext(root.left);
        changeNext(root.right);
        return root;
    }
    public void changeNext(Node node){
        if (node.left == null || node.right == null){
            return;
        }
        node.left.next = node.right;
        if (node.next != null){
            node.right.next = node.next.left;
        }
        changeNext(node.left);
        changeNext(node.right);

    }



}
