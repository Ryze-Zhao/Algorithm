package com.zhaolearn.algorithm232;

import java.util.Stack;

/**
 * 方法一：双栈(自己想的)
 * <p>
 * 执行用时：0 ms, 在所有Java提交中击败了100.00%的用户
 * 内存消耗：36.4 MB, 在所有Java提交中击败了44.77%的用户
 */
public class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    /**
     * 初始化
     */
    public MyQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    /**
     * x从后端入队
     */
    public void push(int x) {
        //加入x到栈
        stack2.push(x);
        if (!stack1.isEmpty()) {
//            置换
            stack2.addAll(stack1);
            stack1.clear();
        }
        // 交换
        Stack<Integer> temp = stack1;
        stack1 = stack2;
        stack2 = temp;
    }

    /**
     * 从队列前端删除该元素并返回该元素
     */
    public int pop() {
        return stack1.pop();
    }

    /**
     * 获得队列前端元素
     */
    public int peek() {
        return stack1.peek();
    }


    /**
     * 判断是否为空
     */
    public boolean empty() {
        return stack1.isEmpty();
    }
}

