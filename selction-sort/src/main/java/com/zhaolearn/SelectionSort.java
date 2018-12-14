package com.zhaolearn;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class SelectionSort {
    public static void select_sort(int[] arr){
        System.out.println("预计次数:"+arr.length*(arr.length-1)/2+" 原数组："+Arrays.toString(arr));
        int forNum=0;//记录循环次数，不属于排序算法
        for(int i=0;i< arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
                System.out.println("---每次排序：" + Arrays.toString(arr));
                forNum++;
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            System.out.println("---第 " + (i + 1) + " 趟排序：" + Arrays.toString(arr));
        }
        System.out.println("循环次数:"+forNum+" 排序后数组："+Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 10, 124, 112, 3, 75, 11};
        System.out.println("------------------------");
        select_sort(arr);
    }
}
