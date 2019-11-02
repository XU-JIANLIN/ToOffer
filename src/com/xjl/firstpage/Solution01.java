package com.xjl.firstpage;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @描述: 在一个二维数组中（每个一维数组的长度相同），
 *       每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 *       请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @作者: XUJIANLIN
 */
public class Solution01 {
    /**
     * 暴力循环
     * @param target
     * @param array
     * @return
     */
    public static boolean Find(int target, int[][] array){
        int row = (int)array.length;
        int col = (int)array[0].length;
        if (row == 0 || col == 0)
            return false;

        for (int i = 0;i < row; i++ ){
            for (int j = 0; j<col ; j++){

                if(array[i][j] == target){
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int [][] array = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};

        System.out.println(Find(7,array));

    }
}
