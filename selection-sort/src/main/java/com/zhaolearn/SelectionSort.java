package com.zhaolearn;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Hello world!
 */
public class SelectionSort {
    public static void select_sort(int[] arr) {
        //用于记录次数用的数字
        int num=0;
        System.out.println("原数组："+Arrays.toString(arr));
        //temp用于交换
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            //记录当前下标，暂时因为当前下标的对应arr[]值最小
            int minIntIndex = i;
            for (int j = arr.length - 1; i < j; j--) {
                //一直寻找最小的，如果有就替换
                if (arr[minIntIndex] > arr[j]) {
                    minIntIndex = j;
                }
                num++;
            }
            //如果默认值被改变，证明找到更小的数值，那就交换
            if (minIntIndex != i) {
                temp = arr[i];
                arr[i] = arr[minIntIndex];
                arr[minIntIndex] = temp;
            }
            System.out.println("第"+(i+1)+"大次"+" 第"+num+"小次"+Arrays.toString(arr));

        }
        System.out.println("处理"+num+"次后数组："+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 124, 112, 3, 75, 11};
        System.out.println("-------------------------");
        select_sort(arr);
    }
}
