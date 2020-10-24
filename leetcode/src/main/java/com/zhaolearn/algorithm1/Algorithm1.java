package com.zhaolearn.algorithm1;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 *  
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 *
 * https://leetcode-cn.com/problems/two-sum/
 */
public class Algorithm1 {


    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] twoSum1 = twoSum2(nums, target);
        for (int i : twoSum1) {
            System.out.println(i);
        }

    }
//还有一种是暴力破解的方式


    /**
     * 哈希
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums,int target){
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int i1 = target - nums[i];
            if(integerIntegerHashMap.containsKey(i1)){
                return new int[]{i,integerIntegerHashMap.get(i1)};
            }
            integerIntegerHashMap.put( nums[i],i);
        }
        return null;
    }
}