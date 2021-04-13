package com.zhaolearn.algorithm844;

/**
 * 方法三：自己瞎写for
 *执行用时：1 ms, 在所有Java提交中击败了86.60%的用户
 * 内存消耗：36.7 MB, 在所有Java提交中击败了54.79%的用户
 */
public class Solution3 {
    public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public String build(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 35) {
                if (stringBuffer.length() != 0) {
                    stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                }
            } else {
                stringBuffer.append(c);
            }
        }
        return String.valueOf(stringBuffer);
    }
}