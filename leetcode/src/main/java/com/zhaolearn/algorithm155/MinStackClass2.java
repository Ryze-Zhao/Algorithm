package com.zhaolearn.algorithm155;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 方法二：一个栈
 * 题目是设计一个栈，如果不是要求设计一个栈的话，可以将Deque换为stack
 */
public class MinStackClass2 {
    private Deque<Integer> stack;
    private int min;

    public MinStackClass2() {
        stack = new LinkedList<Integer>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (min == stack.peek()) {
            stack.pop();
            min = stack.pop();
        } else {
            stack.pop();
        }
        if (stack.isEmpty()) {
            min = Integer.MAX_VALUE;
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}