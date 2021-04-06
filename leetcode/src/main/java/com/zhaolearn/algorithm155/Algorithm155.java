package com.zhaolearn.algorithm155;

import java.util.*;

/**
 * 最小栈
 */
public class Algorithm155 {
    public static void main(String[] args) {
//        fun1();
        fun2();
    }


    public static void fun1(){
        MinStackClass minStackClass = new MinStackClass();
        minStackClass.push(-2);
        minStackClass.push(0);
        minStackClass.push(-3);
        System.out.println(minStackClass.getMin());
        minStackClass.pop();
        System.out.println(minStackClass.top());
        System.out.println(minStackClass.getMin());
    }
    public static void fun2(){
        MinStackClass2 minStackClass = new MinStackClass2();
        minStackClass.push(-2);
        minStackClass.push(0);
        minStackClass.push(-3);
        System.out.println(minStackClass.getMin());
        minStackClass.pop();
        System.out.println(minStackClass.top());
        System.out.println(minStackClass.getMin());
    }






}