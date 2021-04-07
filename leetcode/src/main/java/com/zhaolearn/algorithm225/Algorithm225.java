package com.zhaolearn.algorithm225;


/**
 * 用队列实现栈
 */
public class Algorithm225 {
    public static void main(String[] args) {
//        fun1();
        fun2();
    }


    public static void fun1() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top()); //2
        System.out.println(myStack.pop()); //2
        System.out.println(myStack.empty());// 返回 false
        System.out.println(myStack.top()); //1
        System.out.println(myStack.pop()); //1
        System.out.println(myStack.empty());// 返回 true
    }

    public static void fun2() {
        MyStack2 myStack = new MyStack2();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top()); //2
        System.out.println(myStack.pop()); //2
        System.out.println(myStack.empty());// 返回 false
        System.out.println(myStack.top()); //1
        System.out.println(myStack.pop()); //1
        System.out.println(myStack.empty());// 返回 true
    }
}