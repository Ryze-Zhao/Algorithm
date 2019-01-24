package com.zhaolearn;

import java.util.Arrays;

/**
 * Hello world!
 */
public class ShellSort {
    public static void shell_sort(int arr[]) {
        int whileNum = 0;
        System.out.println("预计次数≤" + arr.length * (arr.length - 1) / 2 + " 原数组：" + Arrays.toString(arr));
        int forNum = 0;//记录循环次数，不属于排序算法
        int incre = arr.length;
        int temp = 0;
        while (true) {
            whileNum++;
            incre = incre / 2;//数组分半
            for (int k = 0; k < incre; k++) {    //根据增量分为若干子序列
                for (int i = k + incre; i < arr.length; i += incre) {
                    for (int j = i; j > k; j -= incre) {
                        System.out.println("第" + whileNum + "轮while，其中incre为" + incre + ",其中k为" + k + ",其中arr.length为" + arr.length + ",其中i为" + i + ",其中j为" + j);
                        forNum++;
                        if (arr[j] < arr[j - incre]) {
                            System.out.println("  *****转换原因：arr[" + (j - incre) + "](数值：" + arr[j - incre] + ")比arr[" + j + "](数值：" + arr[j] + ")大,所以交换");
                            temp = arr[j - incre];
                            arr[j - incre] = arr[j];
                            arr[j] = temp;
                            //转换
                            System.out.println("  ----转：" + Arrays.toString(arr));
                        } else {
                            System.out.println("  ----不：" + Arrays.toString(arr));
                            break;
                        }
                    }
                }
            }
            if (incre == 1) {
                break;
            }
        }
        System.out.println("循环次数:" + forNum + " 排序后数组：" + Arrays.toString(arr));
    }


    public static void shell_sort1(int arr[]) {
        // i表示希尔排序中的第n/2+1个元素（或者n/4+1）
        // j表示希尔排序中从0到n/2的元素（n/4）
        // r表示希尔排序中n/2+1或者n/4+1的值
        int num=0;
        int i, j, r, tmp;
        // 划组排序
        for (r = arr.length / 2; r >= 1; r = r / 2) {
            for (i = r; i < arr.length; i++) {
                tmp = arr[i];
                j = i - r;
                // 一轮排序
                while (j >= 0 && tmp < arr[j]) {
                    arr[j + r] = arr[j];
                    j -= r;
                }
                arr[j + r] = tmp;
            }
            System.out.println(i + ":" + Arrays.toString(arr));
        }
        System.out.println(num+"排序后数组：" + Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = {21, 35, 10, 124, 112, 3, 75, 11};
        System.out.println("------------------------");
        shell_sort1(arr);
    }
}
