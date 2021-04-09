package com.zhaolearn.algorithm496;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * 方法三：栈（单调栈）（官网推荐）
 *
 *
 * 时间复杂度：O(N + M)，分别遍历数组 nums1 和数组 nums2 各一次即可，对于 nums2 中的每个元素，进栈一次，出栈一次；
 * 空间复杂度：O(N)。我们在遍历 nums2 时，需要使用栈，以及哈希映射用来临时存储答案。
 *
 * 执行用时：5 ms, 在所有Java提交中击败了82.77%的用户
 * 内存消耗：38.9 MB, 在所有Java提交中击败了8.11%的用户
 *
 *
 */
public class Solution3 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        Deque<Integer> stack = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();
        // 先处理 nums2，把对应关系存入哈希表
        for (int i = 0; i < len2; i++) {
            while (!stack.isEmpty() && stack.peekLast() < nums2[i]) {
                map.put(stack.removeLast(), nums2[i]);
            }
            stack.addLast(nums2[i]);
        }

        // 遍历 nums1 得到结果集
        int[] res = new int[len1];
        for (int i = 0; i < len1; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;
    }
}