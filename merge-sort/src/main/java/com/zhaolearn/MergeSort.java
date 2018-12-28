package com.zhaolearn;

/**
 * Hello world!
 *
 */
public class MergeSort {

    //将有序数组a[]和b[]合并到c[]中
    public void MemeryArray(int a[], int n, int b[], int m, int c[])
    {
        int i, j, k;

        i = j = k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }
    }


    public static void main(String[] args) {
        int[] arr = {21, 35, 10, 124, 112, 3, 75, 11};
        System.out.println("------------------------");
    }
}
