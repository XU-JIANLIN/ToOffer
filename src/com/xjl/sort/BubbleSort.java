package com.xjl.sort;

/**
 * @描述: 实现冒泡排序
 * 算法描述： 从0开始，每两个数进行比较，如果前一个数比后一个数大的话，交换位置，
 *              依次找出数组中最大的一个值。
 *
 * 时间复杂度：O(n^2)
 *
 * @作者: XUJIANLIN
 */
public class BubbleSort {
    public static void  Bubble_Sort(int[] arr){
        if (arr == null ||arr.length < 2 ){
            return;
        }
        for(int end = arr.length - 1; end > 0; end--){
            for(int i = 0; i < end; i++){
                if(arr[i] > arr[i+1]){
                   swap(arr,i,i+1);
                }

            }
          display(arr);

        }
    }

    public static void main(String[] args) {
       int [] arr = {45,65,8,47,15,10,3,9,4};
        Bubble_Sort(arr);

        System.out.println("最后结果");
        display(arr);

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
