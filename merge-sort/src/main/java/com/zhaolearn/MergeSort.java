package com.zhaolearn;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {21, 35, 10, 124, 112, 3, 75, 11};
        int []temp = new int[arr.length];
        System.out.println("------------------------");
        merge_sort(arr,0,7,temp);
        System.out.println(Arrays.toString(arr));
    }

    private static void merge_sort(int[] arr,int left,int right,int []temp){
        if(left<right){
            int mid = (left+right)/2;
            merge_sort(arr,left,mid,temp);//左边归并排序，使得左子序列有序
            merge_sort(arr,mid+1,right,temp);//右边归并排序，使得右子序列有序
            merge(arr,left,mid,right,temp);//将两个有序子数组合并操作
        }
    }
    private static void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i = left;//左序列指针
        int j = mid+1;//右序列指针
        int t = 0;//临时数组指针
        while (i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[t++] = arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }
        while(i<=mid){//将左边剩余元素填充进temp中
            temp[t++] = arr[i++];
        }
        while(j<=right){//将右序列剩余元素填充进temp中
            temp[t++] = arr[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while(left <= right){
            arr[left++] = temp[t++];
        }
    }
}
