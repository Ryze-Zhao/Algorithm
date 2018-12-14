package com.zhaolearn;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class SelectionSort {
    public static void select_sort(int[] array){
        for(int i=0;i< array.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {

        int[] arr = {2, 3, 10, 124, 112, 3, 75, 11};
        System.out.println("------------------------");
        select_sort(arr);
    }
}
