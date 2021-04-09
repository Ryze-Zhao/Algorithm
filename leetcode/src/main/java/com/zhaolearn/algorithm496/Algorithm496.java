package com.zhaolearn.algorithm496;


import java.util.Arrays;

/**
 * 棒球比赛
 */
public class Algorithm496 {
    public static void main(String[] args) {
        fun1();
//        fun2();
//        fun3();
    }

    public static void fun1() {
        Solution solution = new Solution();
        int[] num1 = new int[]{4, 1, 2};
        int[] num2 = new int[]{1, 3, 4, 2};
        System.out.println(Arrays.toString(solution.nextGreaterElement(num1, num2)));


        int[] num3 = new int[]{2,4};
        int[] num4 = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(solution.nextGreaterElement(num3, num4)));
    }

    public static void fun2() {
        Solution2 solution = new Solution2();
        int[] num1 = new int[]{4, 1, 2};
        int[] num2 = new int[]{1, 3, 4, 2};
        System.out.println(Arrays.toString(solution.nextGreaterElement(num1, num2)));


        int[] num3 = new int[]{2,4};
        int[] num4 = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(solution.nextGreaterElement(num3, num4)));
    }

    public static void fun3() {
        Solution3 solution = new Solution3();
        int[] num1 = new int[]{4, 1, 2};
        int[] num2 = new int[]{1, 3, 4, 2};
        System.out.println(Arrays.toString(solution.nextGreaterElement(num1, num2)));


        int[] num3 = new int[]{2,4};
        int[] num4 = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(solution.nextGreaterElement(num3, num4)));
    }
}