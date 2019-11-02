package com.xjl.firstpage;

/**
 * @描述: 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 *          假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *          例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @作者: XUJIANLIN
 */
public class Solution04 {
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in){

        //递归出口
        if(pre.length == 0 || in.length == 0 || pre.length != in.length){
            return null;
        }

        // 拿到根结点
        TreeNode root = new TreeNode(pre[0]);

        // 找的根结点在中序遍历中的位置
        int i = 0;
        while(in[i] != root.val) {
            i++;
        }



        //确定左子树前序遍历长度
        int[] preLeft = new int[i];
        //确定左子树中序遍历长度
        int[] inLeft = new int[i];

        //确定右子树前序遍历长度
        int[] preRight = new int[in.length - i -1];
        //确定右子树中序遍历长度
        int[] inRight = new int[in.length - i -1];


        //依次获得左右子树的
        for(int j = 0; j<in.length; j++){
            if(j<i){
                preLeft[j] = pre[j+1];
                inLeft[j] = in[j];
            }else if(j>i){
                preRight[j-i-1] = pre[j];
                inRight[j-i-1] = in[j];
            }
        }
        root.left = reConstructBinaryTree(preLeft, inLeft);
        root.right = reConstructBinaryTree(preRight, inRight);

        return root;
    }

    //前序遍历
    public static void pre(TreeNode treeNode){

        if(treeNode == null) {
            return ;
        }
        System.out.print(treeNode.val +" ");
        pre(treeNode.left);
        pre(treeNode.right);


    }
    //中序遍历
    public static void in(TreeNode treeNode){
        if(treeNode == null) {
            return ;
        }
        in(treeNode.left);
        System.out.print(treeNode.val +" ");
        in(treeNode.right);
    }
    //后序遍历
    public static void last(TreeNode treeNode){
        if(treeNode == null) {
            return ;
        }

        last(treeNode.left);
        last(treeNode.right);
        System.out.print(treeNode.val +" ");

    }
    public static void main(String[] args) {
        int [] pre = {1,2,4,7,3,5,6,8};
        int [] in = {4,7,2,1,5,3,8,6};
        TreeNode treeNode = reConstructBinaryTree(pre, in);
        System.out.println("前序遍历");
        pre(treeNode);
        System.out.println("\n中序遍历");
        in(treeNode);
        System.out.println("\n后序遍历");
        last(treeNode);


    }


}
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
    public  TreeNode(int val){
        this.val = val;
    }

}
