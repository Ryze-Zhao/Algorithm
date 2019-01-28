package com.zhaolearn;

/**
 * Hello world!
 *
 */
public class QuickSort{
    public static void quickSort(int[]a,int left,int right)
    {
        if(left>right)
            return;
        int pivot=a[left];//定义基准值为数组第一个数
        int i=left;
        int j=right;

        while(i<j)
        {
            while(pivot<=a[j]&&i<j)//从右往左找比基准值小的数
                j--;
            while(pivot>=a[i]&&i<j)//从左往右找比基准值大的数
                i++;
            if(i<j)                     //如果i<j，交换它们
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        a[left]=a[i];
        a[i]=pivot;//把基准值放到合适的位置
        quickSort(a,left,i-1);//对左边的子数组进行快速排序
        quickSort(a,i+1,right);//对右边的子数组进行快速排序
    }
    public static void main(String[] args) {
        int[] arr = {21, 35, 10, 124, 112, 3, 75, 11};
        System.out.println("------------------------");
        quickSort(arr,1,1);
    }
}
