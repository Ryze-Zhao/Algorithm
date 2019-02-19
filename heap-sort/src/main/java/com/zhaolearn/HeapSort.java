package com.zhaolearn;

import java.util.Arrays;

/**
 * 这个是从大到小排序
 * 1、从arr[aarr.length-1]也就是最后一个数字开始，将所有子节点与他们的父节点进行比较，如果子节点比父节点小，就交换位置，这样在父节点的数字肯定比他的子节点数字大；
 * 2、
 */
public class HeapSort {
    public static void MaxHeap_Sort(int arr[]){
        int temp = 0;
        //这一步是将所有父节点改为最小的数
        for(int i=(arr.length-1)/2 ; i>=0 ; i--){
            System.out.println("父节点前："+Arrays.toString(arr)+" i的值："+i);
            MaxHeapFixdown(arr,i,arr.length);
            System.out.println("父节点后："+Arrays.toString(arr)+" i的值："+i);
            System.out.println("--------------------------");
        }
        for(int i=arr.length-1;i>0;i--){
            System.out.println("子节点前："+Arrays.toString(arr)+" i的值："+i);
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            MaxHeapFixdown(arr,0,i);
            System.out.println("子节点后："+Arrays.toString(arr)+" i的值："+i);
            System.out.println("--------------------------");
        }
    }
    //这是从i节点开始调整,n为节点总数 从0开始计算 i节点的子节点为 2*i+1, 2*i+2
    public static void MaxHeapFixdown(int a[],int i,int n){
        int temp = 0;
        for(int j=2*i+1;j<n;i=j,j=2*i+1){

            //在左右子节点中寻找最小的
            if(j+1<n && a[j+1]<a[j]){
                j++;
            }
            if(a[i] <= a[j]) {
                break;
            }
            //较大节点下移
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;

        }
    }

    public static void main(String[] args) {
        int[] arr = {21, 35, 10, 124, 112, 3, 75, 11};
        System.out.println("--------------------------");
        MaxHeap_Sort(arr);
        System.out.println("排序完成："+Arrays.toString(arr));
    }
}
