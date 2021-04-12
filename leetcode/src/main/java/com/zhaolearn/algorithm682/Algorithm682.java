package com.zhaolearn.algorithm682;


/**
 * 棒球比赛
 */
public class Algorithm682 {
    public static void main(String[] args) {
        fun1();
//        fun2();
//        fun3();
    }

    public static void fun1() {
        String[] ops = new String[]{"5", "2", "C", "D", "+"};
        String[] ops1 = new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"};
        String[] ops2 = new String[]{"1"};
        Solution solution = new Solution();
        System.out.println(solution.calPoints(ops));
        System.out.println(solution.calPoints(ops1));
        System.out.println(solution.calPoints(ops2));
    }

    public static void fun2() {
        String[] ops = new String[]{"5", "2", "C", "D", "+"};
        String[] ops1 = new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"};
        String[] ops2 = new String[]{"1"};
        Solution2 solution = new Solution2();
        System.out.println(solution.calPoints(ops));
        System.out.println(solution.calPoints(ops1));
        System.out.println(solution.calPoints(ops2));
    }


    public static void fun3() {

    }
}