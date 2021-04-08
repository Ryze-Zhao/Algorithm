package com.zhaolearn.algorithm232;

import java.util.Stack;

/**
 * 方法二：单栈(自己想的)
 * <p>
 * 执行用时：0 ms, 在所有Java提交中击败了100.00%的用户
 * 内存消耗：36.1 MB, 在所有Java提交中击败了88.87%的用户
 *
 * 再次提交后只有50%内存了
 */
public class MyQueue2 {
    Stack<Integer> stack1;

    /**
     * 初始化
     */
    public MyQueue2() {
        stack1 = new Stack<Integer>();
    }

    /**
     * x从后端入队
     */
    public void push(int x) {
        if (!stack1.isEmpty()) {
            // 加入到最前
            stack1.add(0, x);
        } else {
            stack1.push(x);
        }
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

