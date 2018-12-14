package com.zhaolearn;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class ShellSort {
    public static void shell_sort(int arr[]){
        System.out.println("预计次数≤"+arr.length*(arr.length-1)/2+" 原数组："+Arrays.toString(arr));
        int forNum=0;//记录循环次数，不属于排序算法
        int incre = arr.length;
        int temp = 0;
        while(true){
            incre = incre/2;//数组分半
            for(int k = 0;k<incre;k++){    //根据增量分为若干子序列
                for(int i=k+incre;i<arr.length;i+=incre){
                    for(int j=i;j>k;j-=incre){
                        forNum++;
                        if(arr[j]<arr[j-incre]){
                            temp = arr[j-incre];
                            arr[j-incre] = arr[j];
                            arr[j] = temp;
                            System.out.println("---每次排序：" + Arrays.toString(arr));
                        }else{
                            System.out.println("---每次排序：" + Arrays.toString(arr));
                            break;
                        }
                    }
                    System.out.println("---第 " + (i + 1) + " 趟i排序：" + Arrays.toString(arr));
                }
                System.out.println("---第 " + (k + 1) + " 趟k排序：" + Arrays.toString(arr));
            }
            if(incre == 1){
                break;
            }

        }
        System.out.println("循环次数:"+forNum+" 排序后数组："+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {21, 35, 10, 124, 112, 3, 75, 11};
        System.out.println("------------------------");
        shell_sort(arr);
    }
}
