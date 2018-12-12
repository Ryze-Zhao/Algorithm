package com.zhaolearn;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class BubbleSort{
    public static void bubbleSort1(int[] arr){
        int forNum=0;//记录循环次数，不属于排序算法
        int temp;//临时变量
        for(int i=0; i<arr.length-1; i++){   //表示趟数，一共arr.length-1次。
            for(int j=arr.length-1; j>i; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                forNum++;
            }
        }
        System.out.println("循环次数:"+forNum+" 排序后数组："+Arrays.toString(arr));
    }
    public static void bubbleSort2(int[] arr){
        int forNum=0;//记录循环次数，不属于排序算法
        int temp;//临时变量
        boolean flag;//是否交换的标志
        for(int i=0; i<arr.length-1; i++){   //表示趟数，一共arr.length-1次。
           flag=false;
            for(int j=arr.length-1; j>i; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag=true;
                }
                forNum++;
            }
            if(!flag) break;
        }
       System.out.println("循环次数:"+forNum+" 排序后数组："+Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr={561,225,3,124,112,1324,325,1421,3,75};
        bubbleSort1(arr);
        System.out.println("------------------------");
        bubbleSort2(arr);
    }
}
