package com.zhaolearn.algorithm232;

import java.util.Deque;
import java.util.LinkedList;
/**
 * 方法三：两个栈（官网推荐）
 * 执行用时：0 ms, 在所有Java提交中击败了100.00%的用户
 * 内存消耗：36.3 MB, 在所有Java提交中击败了51.40%的用户
 *
 */
public class MyQueue3 {
    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public MyQueue3() {
        inStack = new LinkedList<Integer>();
        outStack = new LinkedList<Integer>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        //只有用于输出的outStack没值，才进行转换
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.pop();
    }

    public int peek() {
        //只有用于输出的outStack没值，才进行转换
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.peek();
    }

    public boolean empty() {
        //两个栈都是空才是真的空
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void in2out() {
        //将inStack入栈的数据，出栈到outStack，那么inStack[5, 4, 3, 2, 1]（左端是栈顶）转换为outStack[1, 2, 3, 4, 5]（左端是栈顶）即刚刚好与队列相同，先进先出
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }
}
