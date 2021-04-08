package com.zhaolearn.algorithm232;


/**
 * 用栈实现队列
 */
public class Algorithm232 {
    public static void main(String[] args) {
//        fun1();
//        fun2();
        fun3();
    }


    public static void fun1() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        System.out.println(myQueue.stack1);
        System.out.println(myQueue.stack2);
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.stack1);
        System.out.println(myQueue.stack2);
        myQueue.push(3); // queue is: [1, 2, 3] (leftmost is front of the queue)
        System.out.println(myQueue.stack1);
        System.out.println(myQueue.stack2);
        myQueue.push(4); // queue is: [1, 2, 3, 4] (leftmost is front of the queue)
        System.out.println(myQueue.stack1);
        System.out.println(myQueue.stack2);
        myQueue.push(5); // queue is: [1, 2, 3, 4, 5] (leftmost is front of the queue)
        System.out.println(myQueue.stack1);
        System.out.println(myQueue.stack2);
        System.out.println(myQueue.peek());// return 1
        System.out.println(myQueue.pop()); // return 1, queue is [2, 3, 4, 5]
        System.out.println(myQueue.empty()); // return false
        System.out.println(myQueue.peek()); // return 2
        System.out.println(myQueue.pop()); // return 2, queue is []
        System.out.println(myQueue.empty()); // return false
    }

    public static void fun2() {
        MyQueue2 myQueue = new MyQueue2();
        myQueue.push(1); // queue is: [1]
        System.out.println(myQueue.stack1);
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.stack1);
        myQueue.push(3); // queue is: [1, 2, 3] (leftmost is front of the queue)
        System.out.println(myQueue.stack1);
        myQueue.push(4); // queue is: [1, 2, 3, 4] (leftmost is front of the queue)
        System.out.println(myQueue.stack1);
        myQueue.push(5); // queue is: [1, 2, 3, 4, 5] (leftmost is front of the queue)
        System.out.println(myQueue.stack1);
        System.out.println(myQueue.peek());// return 1
        System.out.println(myQueue.pop()); // return 1, queue is [2, 3, 4, 5]
        System.out.println(myQueue.empty()); // return false
        System.out.println(myQueue.peek()); // return 2
        System.out.println(myQueue.pop()); // return 2, queue is []
        System.out.println(myQueue.empty()); // return false
    }


    public static void fun3() {
        MyQueue3 myQueue = new MyQueue3();
        myQueue.push(1); // queue is: [1]
        System.out.println(myQueue.inStack);
        System.out.println(myQueue.outStack);
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.inStack);
        System.out.println(myQueue.outStack);
        myQueue.push(3); // queue is: [1, 2, 3] (leftmost is front of the queue)
        System.out.println(myQueue.inStack);
        System.out.println(myQueue.outStack);
        myQueue.push(4); // queue is: [1, 2, 3, 4] (leftmost is front of the queue)
        System.out.println(myQueue.inStack);
        System.out.println(myQueue.outStack);
        myQueue.push(5); // queue is: [1, 2, 3, 4, 5] (leftmost is front of the queue)
        System.out.println(myQueue.inStack);
        System.out.println(myQueue.outStack);
        System.out.println(myQueue.peek());// return 1
        System.out.println(myQueue.inStack);
        System.out.println(myQueue.outStack);
        System.out.println(myQueue.pop()); // return 1, queue is [2, 3, 4, 5]
        System.out.println(myQueue.inStack);
        System.out.println(myQueue.outStack);
        System.out.println(myQueue.empty()); // return false
        System.out.println(myQueue.inStack);
        System.out.println(myQueue.outStack);
        System.out.println(myQueue.peek()); // return 2
        System.out.println(myQueue.inStack);
        System.out.println(myQueue.outStack);
        System.out.println(myQueue.pop()); // return 2, queue is []
        System.out.println(myQueue.inStack);
        System.out.println(myQueue.outStack);
        myQueue.push(6);
        System.out.println(myQueue.inStack);
        System.out.println(myQueue.outStack);
        System.out.println(myQueue.empty()); // return false
        System.out.println(myQueue.inStack);
        System.out.println(myQueue.outStack);
        System.out.println(myQueue.pop()); // return 2
        System.out.println(myQueue.inStack);
        System.out.println(myQueue.outStack);
    }
}