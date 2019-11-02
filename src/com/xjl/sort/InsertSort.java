package com.xjl.sort;

/**
 * @描述: 插入排序
 *
 * 时间复杂度：O(n^2)
 * @作者: XUJIANLIN
 */
public class InsertSort {
    public static void Select_sort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        for(int i = 1; i < arr.length; i++){
            for(int j = i - 1; j >= 0 && arr[j] > arr[j+1]; j-- ){
                swap(arr, j, j+1);
            }
            display(arr);
        }




    }
    public static void main(String[] args) {
         int [] arr = {45,65,8,47,15,10,3,9,14};

        Select_sort(arr);

        System.out.println("最后结果");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void swap(int[] arr,int i, int j ){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void display(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

    }

}
