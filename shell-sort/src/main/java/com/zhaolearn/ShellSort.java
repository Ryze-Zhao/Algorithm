package com.zhaolearn;

/**
 * Hello world!
 *
 */
public class ShellSort {
    public static void shell_sort(int arr[]){
        int temp = 0;
        int incre = arr.length;
        while(true){
            incre = incre/2;
            for(int k = 0;k<incre;k++){    //根据增量分为若干子序列
                for(int i=k+incre;i<arr.length;i+=incre){

                    for(int j=i;j>k;j-=incre){
                        if(arr[j]<arr[j-incre]){
                            temp = arr[j-incre];
                            arr[j-incre] = arr[j];
                            arr[j] = temp;
                        }else{
                            break;
                        }
                    }
                }
            }
            if(incre == 1){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {21, 35, 10, 124, 112, 3, 75, 11};
        System.out.println("------------------------");
        shell_sort(arr);
    }
}
