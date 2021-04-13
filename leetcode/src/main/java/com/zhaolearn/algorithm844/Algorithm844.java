package com.zhaolearn.algorithm844;


/**
 * 棒球比赛
 */
public class Algorithm844 {
    public static void main(String[] args) {
//        fun1();
//        fun2();
        fun3();
    }

    public static void fun1() {
        String s1 = "ab#c", t1 = "ad#c";
        String s2 = "ab##", t2 = "c#d#";
        String s3 = "a##c", t3 = "#a#c";
        String s4 = "a#c", t4 = "b";
        Solution solution = new Solution();
        System.out.println(solution.backspaceCompare(s1, t1));
        System.out.println("==========================");
        System.out.println(solution.backspaceCompare(s2, t2));
        System.out.println("==========================");
        System.out.println(solution.backspaceCompare(s3, t3));
        System.out.println("==========================");
        System.out.println(solution.backspaceCompare(s4, t4));
    }

    public static void fun2() {
        String s1 = "ab#c", t1 = "ad#c";
        String s2 = "ab##", t2 = "c#d#";
        String s3 = "a##c", t3 = "#a#c";
        String s4 = "a#c", t4 = "b";
        Solution2 solution = new Solution2();
        System.out.println(solution.backspaceCompare(s1, t1));
        System.out.println("==========================");
        System.out.println(solution.backspaceCompare(s2, t2));
        System.out.println("==========================");
        System.out.println(solution.backspaceCompare(s3, t3));
        System.out.println("==========================");
        System.out.println(solution.backspaceCompare(s4, t4));
    }


    public static void fun3() {
        String s1 = "ab#c", t1 = "ad#c";
        String s2 = "ab##", t2 = "c#d#";
        String s3 = "a##c", t3 = "#a#c";
        String s4 = "a#c", t4 = "b";
        Solution3 solution = new Solution3();
        System.out.println(solution.backspaceCompare(s1, t1));
        System.out.println("==========================");
        System.out.println(solution.backspaceCompare(s2, t2));
        System.out.println("==========================");
        System.out.println(solution.backspaceCompare(s3, t3));
        System.out.println("==========================");
        System.out.println(solution.backspaceCompare(s4, t4));
    }
}