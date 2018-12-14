package com.zhaolearn;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class InsertSort {
    public static void  insert_sort(int arr[]){
        System.out.println("预计次数≤"+arr.length*(arr.length-1)/2+" 原数组："+Arrays.toString(arr));
        int forNum=0;//记录循环次数，不属于排序算法
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{         //不需要交换
                    break;
                }
                forNum++;
                System.out.println("---每次排序：" + Arrays.toString(arr));
            }
            System.out.println("---第 " + (i + 1) + " 趟排序：" + Arrays.toString(arr));
        }
        System.out.println("循环次数:"+forNum+" 排序后数组："+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {21, 35, 10, 124, 112, 3, 75, 11};
        System.out.println("------------------------");
        insert_sort(arr);
    }
}
