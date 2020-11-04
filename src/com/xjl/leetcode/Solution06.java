package com.xjl.leetcode;

/**
 * 52. N皇后 II
 * n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 */


/**
 * 解法：
 */


public class Solution06 {
    public static int totalNQueens(int n) {
        int count = 0;
        // ①用二维数组来代替棋盘
        int[][] arrs = new int[n][n];
        for (int row =0, col = 0; col < n; col++){
            // ②按列下棋，皇后只能走 0 的区域，每走一步，把皇后所能攻击到的区域化为1

            if (!help(row, col, arrs)){
                // ④若遇到皇后无路可走时，break;重新循环
                break;
            }
            // ③等到 皇后全部走完时，count+1
            if (col == n - 1) {
                count++;
                col = 0;
                row++;
                //初始化棋盘
                for (int i =0; i < arrs.length; i++){
                    for (int j =0; j< arrs.length;j++){
                        arrs[i][j] = 0;
                    }
                }
            }
        }

        return count;

    }

    //row 指的是 当前在第几行
    //col 指的是 当前在第几列
    //判断这一列是否还能下棋，可以的话下棋，并调整棋盘，否则返回false;
    public static boolean help(int row, int col, int[][] arrs){
        // arrs[行][列]
        for (int i = 0; i < arrs.length; i++){
            // 遍历当前 列，是否存在某一行i 可以放置皇后
            if (arrs[i][col] == 0){

                arrs[i][col] = 1; //放置皇后


                for (int j = col; j < arrs.length; j++){
                    arrs[i][j] = 1;
                }
                int tmp1 = i;
                int tmp2 = i;
                int tmp3 = col;
                for (int j = 0; j < i; j++){
                    arrs[tmp1--][tmp3+1] = 1;
                }
                for (int j = i; j < arrs.length - i; j++){
//                    arrs[j][col] = 1;
                    //不能+1，
                    arrs[tmp2++][col++] = 1;
                }
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(totalNQueens(4));

    }
}
