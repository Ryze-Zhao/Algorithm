package com.zhaolearn;

/**
 * Hello world!
 *
 */
public class App {
    public static void  insert_sort(int arr[]){

        int temp;

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{         //不需要交换
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 124, 112, 3, 75, 11};
        System.out.println("------------------------");
        insert_sort(arr);
    }
}
