package com.zhaolearn.algorithm682;

import java.util.Stack;

/**
 * 方法一：使用栈
 */
public class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i=0;i<ops.length;i++){
            String s = ops[i];
            if (s.equals("C")){
                stack.pop();
            }else if (s.equals("D")){
                stack.push(stack.peek()*2);
            }else if (s.equals("+")){
                stack.push(stack.get(stack.size()-2) + stack.peek());
            }else {
                stack.push(Integer.parseInt(s));
            }
        }
        while (!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}