package com.zhaolearn;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {21, 35, 10, 124, 112, 3, 75, 11};
        System.out.println("------------------------");
        mergeSort(arr, 0, arr.length-1, new int[arr.length]);
        System.out.println("排序完成："+Arrays.toString(arr));
    }

    public static void mergeSort(int a[], int first, int last, int temp[]) {
        if (first < last) {
            int middle = (first + last) / 2;
            mergeSort(a, first, middle, temp);//左半部分排好序
            mergeSort(a, middle + 1, last, temp);//右半部分排好序
            mergeArray(a, first, middle, last, temp); //合并左右部分

        }
    }

    public static void mergeArray(int a[], int first, int middle, int end, int temp[]) {
        System.out.println("进入时：Arr："+Arrays.toString(a)+"  Temp:"+Arrays.toString(temp));
        int i = first;//左序列指针
        int m = middle;
        int j = middle + 1;//右序列指针
        int n = end;//临时数组指针
        int k = 0;
        while (i <= m && j <= n) {
            if (a[i] <= a[j]) {
                temp[k] = a[i];
                k++;
                i++;
            } else {
                temp[k] = a[j];
                k++;
                j++;
            }
        }
        while (i <= m) {
            temp[k] = a[i];
            k++;
            i++;
        }
        while (j <= n) {
            temp[k] = a[j];
            k++;
            j++;
        }

        for (int ii = 0; ii < k; ii++) {
            a[first + ii] = temp[ii];
        }
        System.out.println("结束时：Arr："+Arrays.toString(a)+"  Temp:"+Arrays.toString(temp));
        System.out.println();
    }
}
