package com.zhaolearn;

import java.util.Arrays;

/**
 * 1、定基准值
 * 通常定最左手边的值（pivot=21）
 * 2、比较大小、交换、继续找
 * 从右往左找到第一个比pivot小的值(11，下标为j=7)，从左往右找到第一个比pivot大的值（35，下标为i=1），如果i<j,就交换位置，这样比基准小的值在左边，比基准大的值在右边
 * 变为[21, 11, 10, 124, 112, 3, 75, 35]
 * 继续找，发现（3，下标为5）与（124，下标为3）也符合要求再交换一次
 * 变为[21, 11, 10, 3, 112, 124, 75, 35]
 * 3、交换基准值到合适的位置
 * 以上处理完毕， while (i < j) {}会不成立，然后将arr[i]调到arr[left],再把基准值（pivot=21，原来的arr[left]）调到arr[i]，这个结束后，基准值的左边都比基准值小，右边都比基准值大
 * 4、递归以上操作，直到排序完毕
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {21, 35, 10, 124, 112, 3, 75, 11};
        System.out.println("------------------------");
        //第一次传入时取下标最小和下标最大
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int left, int right) {
        //左边比右边下标大，证明已经过半，不需要继续进行递归
        if (left > right) {
            return;
        }
        int pivot = arr[left]; //定义基准值为数组传入的arr[left]
        int i = left;  //令i=left，继续每次递归最左边的值
        int j = right;//令j=right，继续每次递归最右边的值

        while (i < j) {
            while (pivot <= arr[j] && i < j) {
                j--;//从右往左找比基准值小的数，没有就下标减少1
            }
            while (pivot >= arr[i] && i < j) {
                i++;//从左往右找比基准值大的数，没有就下标增加1
            }
     //如果i<j，证明arr[i]是比基准大，arr[j]比基准小，i<j就可以交换位置，让小的在左边，大的在右边
            if (i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    //把基准值换到   while (i < j) {}不成立对应的i下标位置
        arr[left] = arr[i];
        arr[i] = pivot;//把基准值放到合适的位置
        quickSort(arr, left, i - 1);//对左边的子数组进行快速排序
        quickSort(arr, i + 1, right);//对右边的子数组进行快速排序
        System.out.println(Arrays.toString(arr));
    }
}
