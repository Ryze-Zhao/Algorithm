package com.zhaolearn;


import java.util.Arrays;

/* 基数排序（桶子法）//稳定排序
 * 1.首先找到最大的数的位数
 * 2.根据最大位数把所有数字的高位补0，然后所有数字的长度相等
 * 3.根据最低位个位 0-9开始排序，得到新序列l
 * 4.再根据新序列l对十位开始排序，直到排序到最高位为止
 * 5.感觉类似于hash算法了
 *
 * 数组中的最大数字的位数是多少，需要进行多少次整理
 *
 */
public class RadixSort {
    public static void main(String args[]){
        int[] arr = {21, 35, 10, 124, 112, 3, 75, 11};
        System.out.println("------------------------");
        Sort(arr);
        System.out.println("结束时：Arr："+Arrays.toString(arr));

    }

    public static void Sort(int[] arr){
        int maxSize= findMaxSize(arr);//获取数组最大值的长度
        int[][] ara = new int[10][arr.length];//表示每一位上为0-9的数字，相同的放在一起
        int[] rar = new int[10];//数组rar[i]用来表示某位是i的元素的个数
        //num是总整理次数,n是用于每次执行就往前移动1位（如从个位到十位，十位到百位）,temp是arr数组的下标
        for(int num=0,n=1,temp=0;num<maxSize;num++,n*=10,temp=0){
            for(int i=0;i<arr.length;i++){//从个位开始进行排序 放到相应的二维数组中
                int yu = (arr[i]/n)%10;//求每个数每一位上的数字
                ara[yu][rar[yu]] = arr[i];
                rar[yu]++;
            }
            for(int i=0;i<10;i++){//把每趟整理的数值按整理后的顺序放到原数组中， 进行下次循环排序
                if(rar[i] != 0){
                    for(int j=0; j<rar[i] ; j++){
                        arr[temp]=ara[i][j];
                        temp++;
                    }
                    rar[i]=0;//把相应位上的个数置空，下次使用
                }
            }
        }

    }
    /**
     * 找出传入数组的最大值的长度
     * @param arr 需要找到最大值的长度的数组
     * @return
     */
    public static int findMaxSize(int[] arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            if(temp<arr[i]){
                temp=arr[i];
            }
        }
        //最大数的长度,也就知道了长度，然后其他数补0
        int length=0;
        if(temp>0){
            length= String.valueOf(temp).length();
        }
        return length;
    }
}

