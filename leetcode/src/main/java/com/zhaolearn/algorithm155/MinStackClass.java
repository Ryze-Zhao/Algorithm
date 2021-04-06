package com.zhaolearn.algorithm155;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 官网推荐：辅助栈
 * 题目是设计一个栈，如果不是要求设计一个栈的话，可以将Deque换为stack
 */
public class MinStackClass {
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public MinStackClass() {
        xStack = new LinkedList<>();
        minStack = new LinkedList<Integer>();
        //填充最大值
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        //取栈最顶层的值与给入的值进行比较即可
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    /**
     * 检索栈中的最小元素
     */
    public int getMin() {
        return minStack.peek();
    }
}