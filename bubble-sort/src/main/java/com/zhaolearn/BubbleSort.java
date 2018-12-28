package com.zhaolearn;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Hello world!
 */
public class BubbleSort {
    public static void bubbleSort1(int[] arr) {
        System.out.println("预计次数:" + arr.length * (arr.length - 1) / 2 + " 原数组：" + Arrays.toString(arr));
        int forNum = 0;//记录循环次数，不属于排序算法
        int temp;//临时变量
        for (int i = 0; i < arr.length - 1; i++) {   //表示趟数，一共arr.length-1次。
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                forNum++;
                System.out.println("---每次排序：" + Arrays.toString(arr));
            }
            System.out.println("---第 " + (i + 1) + " 趟排序：" + Arrays.toString(arr));
        }
        System.out.println("循环次数:" + forNum + " 排序后数组：" + Arrays.toString(arr));
    }

    public static void bubbleSort2(int[] arr) {
        System.out.println("预计次数≤:" + arr.length * (arr.length - 1) / 2 + " 原数组：" + Arrays.toString(arr));
        int forNum = 0;//记录循环次数，不属于排序算法
        int temp;//临时变量
        boolean flag;//是否交换的标志
        for (int i = 0; i < arr.length - 1; i++) {   //表示趟数，一共arr.length-1次。
            flag = false;
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = true;
                }
                forNum++;
                System.out.println("---每次排序：" + Arrays.toString(arr));
            }
            System.out.println("---第 " + (i + 1) + " 趟排序：" + Arrays.toString(arr));
            if (!flag) break;
        }
        System.out.println("循环次数:" + forNum + " 排序后数组：" + Arrays.toString(arr));
    }

    public static void bubbleSort3(int[] arr) {
        int temp;
        boolean flag;
        for (int i = arr.length - 1; i > 0; i--) {
            flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 10, 124, 112, 3, 75, 11};
// bubbleSort1(arr);
        System.out.println("------------------------");
        //bubbleSort2(arr);
        bubbleSort3(arr);
    }
}
