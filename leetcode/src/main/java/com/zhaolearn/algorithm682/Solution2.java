package com.zhaolearn.algorithm682;
/**
 * 方法二：使用数组
 *
 * 执行用时：2 ms, 在所有Java提交中击败了91.27%的用户
 * 内存消耗：36.4 MB, 在所有Java提交中击败了96.12%的用户
 */
public class Solution2 {
    public int calPoints(String[] ops) {
        //数组长度
        int length = ops.length;

        //建立一个数字数组，用来存储每次的操作结果
        int[] num = new int[length];
        //数字数组的当前下标
        int index = 0;

        //遍历符号数组
        for (int i = 0; i < length; i++) {
            //当前符号为“C”，需要清除一个数字
            if (ops[i].equals("C")) {
                //下标回退一格，且回退后位置上的数字置零
                index--;
                num[index] = 0;
            }
            //当前符号为“D”，需要翻倍
            else if (ops[i].equals("D")) {
                //当前数字等于前一个数字的两倍
                num[index] = 2 * num[index - 1];
                index++;
            }
            //当前符号为“+”，需要相加
            else if (ops[i].equals("+")) {
                //当前数字等于前两个数字之和
                num[index] = num[index - 1] + num[index - 2];
                index++;
            }
            //当前符号为数字，直接填入数字数组
            else {
                num[index] = Integer.parseInt(ops[i]);
                index++;
            }
        }

        //对数字数组进行求和
        int sum = 0;
        for (int j = 0; j < length; j++) {
            sum += num[j];
        }

        return sum;

    }
}
