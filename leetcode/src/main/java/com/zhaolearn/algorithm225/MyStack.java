package com.zhaolearn.algorithm225;

import java.util.LinkedList;
import java.util.Queue;
/**
 * 方法一：两个队列（官网推荐）
 *
 * 执行用时：0 ms, 在所有Java提交中击败了100.00%的用户
 * 内存消耗：36.1 MB, 在所有Java提交中击败了82.67%的用户
 */
public class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    /**
     * 初始化
     */
    public MyStack() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }

    /**
     * x入栈
     */
    public void push(int x) {
        //加入x到队列，offer与add区别：add超过最大值时抛异常,offer返回false
        queue2.offer(x);
        while (!queue1.isEmpty()) {
            // poll：将首个元素从队列中弹出，会移除首个元素，如果队列是空的，就返回null；
            // peek：查看首个元素，不会移除首个元素，如果队列是空的就返回null；
            // element：查看首个元素，不会移除首个元素，如果队列是空的就抛出异常NoSuchElementException；
            queue2.offer(queue1.poll());
        }
        // 交换
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    /**
     * 删除栈顶部的元素并返回该元素
     */
    public int pop() {
        return queue1.poll();
    }

    /**
     * 获得栈顶元素
     */
    public int top() {
        return queue1.peek();
    }

    /** 判断是否为空 */
    public boolean empty() {
        return queue1.isEmpty();
    }
}

