package com.xjl.leetcode;

public class Solution11 {
    public static int islandPerimeter(int[][] grid) {

        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1){
                    count += 4;
                    if (j + 1 < m && grid[i][j+1] == 1){
                        count -= 2;
                    }
                    if (i + 1 < n && grid[i+1][j] == 1){
                        count -= 2;
                    }
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {

        int[][] arr = new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(arr));

    }



}
