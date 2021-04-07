package com.zhaolearn.algorithm225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 方法一：一个队列（官网推荐）
 * 
 * 执行用时：0 ms, 在所有Java提交中击败了100.00%的用户
 * 内存消耗：36.4 MB, 在所有Java提交中击败了27.61%的用户
 *
 * 注意：如果是在leetcode提交，需要将MyStack2改名为MyStack
 */
public class MyStack2 {
    Queue<Integer> queue;

    /** 初始化 */
    public MyStack2() {
        queue = new LinkedList<Integer>();
    }
    
    /** x入栈*/
    public void push(int x) {
        int n = queue.size();
        queue.offer(x);
        for (int i = 0; i < n; i++) {
            queue.offer(queue.poll());
        }
    }
    
    /** 删除栈顶部的元素并返回该元素 */
    public int pop() {
        return queue.poll();
    }
    
    /** 删除栈顶部的元素并返回该元素 */
    public int top() {
        return queue.peek();
    }
    
    /** 获得栈顶元素 */
    public boolean empty() {
        return queue.isEmpty();
    }
}