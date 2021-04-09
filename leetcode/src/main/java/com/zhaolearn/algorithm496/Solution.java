package com.zhaolearn.algorithm496;

import java.util.HashMap;
/**
 * 方法一：自己乱写
 *
 * 执行用时：4 ms, 在所有Java提交中击败了93.25%的用户
 * 内存消耗：38.4 MB, 在所有Java提交中击败了87.72%的用户
 */
public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> objectObjectHashMap = new HashMap<Integer, Integer>(16);
        for (int i = 0; i < nums2.length; i++) {
            if (i == nums2.length - 1) {
                objectObjectHashMap.put(nums2[i], -1);
            } else {
                for (int j = i + 1; j < nums2.length; j++) {
                    if (nums2[j] > nums2[i]) {
                        objectObjectHashMap.put(nums2[i], nums2[j]);
                        break;
                    } else {
                        objectObjectHashMap.put(nums2[i], -1);
                    }
                }
            }
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = objectObjectHashMap.get(nums1[i]);
        }
        return result;
    }
}