package com.zhaolearn.algorithm20;

import jdk.nashorn.internal.scripts.JD;

import java.util.*;

/**
 * 20. 有效的括号
 * <p>
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "()"
 * 输出：true
 * 示例2：
 * <p>
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例3：
 * <p>
 * 输入：s = "(]"
 * 输出：false
 * 示例4：
 * <p>
 * 输入：s = "([)]"
 * 输出：false
 * 示例5：
 * <p>
 * 输入：s = "{[]}"
 * 输出：true
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 104
 * s 仅由括号 '()[]{}' 组成
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Algorithm20 {
    public static void main(String[] args) {
        System.out.println(Algorithm20.isValid2("{()()}"));
    }


    /**
     * 不使用Map
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if (t == '(' || t == '[' || t == '{') {
                stack.push(t);
            } else {
                if (stack.empty()) {
                    return false;
                }
                if (t == ')') {
                    if (stack.pop() != '(') {
                        return false;
                    }
                } else if (t == ']') {
                    if (stack.pop() != '[') {
                        return false;
                    }
                } else {
                    if (stack.pop() != '{') {
                        return false;
                    }
                }
            }
        }
        return stack.empty();

    }


    /**
     * 官网推荐
     */
    public static boolean isValid1(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>(8) {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || !stack.peek().equals(pairs.get(ch))) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }


    /**
     * 使用ASCII而已
     */
    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if (t == 40 || t == 91 || t == 123) {
                stack.push(t);
            } else {
                if (stack.empty()) {
                    return false;
                }
                if (t == 41) {
                    if (stack.pop() != 40) {
                        return false;
                    }
                } else if (t == 93) {
                    if (stack.pop() != 91) {
                        return false;
                    }
                } else {
                    if (stack.pop() != 123) {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }
}