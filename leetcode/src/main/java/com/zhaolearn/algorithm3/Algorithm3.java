package com.zhaolearn.algorithm3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * ---------------------------------------------------------------------------------
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * ---------------------------------------------------------------------------------
 * 示例 2:
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * ---------------------------------------------------------------------------------
 * 示例 3:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class Algorithm3 {


    public static void main(String[] args) {
        String s = "abcabcbb";
        long start = System.nanoTime();
        System.out.println(lengthOfLongestSubstring4(s));
        System.out.println((System.nanoTime()-start)/1000+"ms");
    }


    /**
     * 穷举所有的子串（定义两个函数）：
     * <p>
     * ①第一个函数穷举所有可能出现的子串结果,对于字符串的每一个字符，它所构成的子串是下标比它大的所有子串组合
     * eg:abc
     * 对于a,子串有a, ab,abc,
     * 对于b,子串有b,bc,
     * 对于c,有子串c
     * 所以字符串abc的所有的子串为a,ab,abc,b,bc,c
     * ②第二个函数用户过滤穷举出来的子串是否重复，用hashset
     * 时间复杂度o(n^3)这种方法会超时
     *
     * @param s
     * @return: int
     */
    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (isTrue(s, i, j)) {
                    res = Math.max(res, j - i);
                }
            }
        }
        return res;

    }

    public static boolean isTrue(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            if (set.contains(s.charAt(i))) {
                return false;
            }
            set.add(s.charAt(i));
        }
        return true;
    }


    /**
     * 由方法二得到的滑动窗口，每次在[start，end]中如果有重复的，我们的做法是更新窗口从end重新开始，这种方法要求定义一个hashmap保存字符到索引的映射，并且每次都会更新map的值
     * <p>
     * 时间复杂度o(n)
     *
     * @param s
     * @return: int
     */
    public static int lengthOfLongestSubstring1(String s) {
        int n = s.length();
        int res = 0;
        int end = 0, start = 0;
        Set<Character> set = new HashSet<>();
        while (start < n && end < n) {
            if (set.contains(s.charAt(end))) {
                //如果set包含该end对应的字符，证明存在重复，因此移除
                set.remove(s.charAt(start++));
            } else {
                set.add(s.charAt(end++));
                //如果现在的范围大于res记录的，就更新，否则保留。
                res = Math.max(res, end - start);
            }

        }
        return res;

    }

    /**
     * 由方法二得到的滑动窗口，每次在[start，end]中如果有重复的，我们的做法是更新窗口从end重新开始，这种方法要求定义一个hashmap保存字符到索引的映射，并且每次都会更新map的值
     * <p>
     * 时间复杂度o(n)
     *
     * @param s
     * @return: int
     */
    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        int res = 0;
        int end = 0, start = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (; start < n && end < n; end++) {
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(map.get(s.charAt(end)), start);
            }
            map.put(s.charAt(end), end + 1);
            res = Math.max(res, end - start + 1);
        }
        return res;
    }

    /**
     * 基本思想是，保留一个将字符串中的字符存储为键并将其位置存储为值的哈希图，并保留两个定义最大子字符串的指针。移动右指针以浏览字符串，同时更新哈希图。如果字符已经在哈希图中，则将左指针移到最后找到的相同字符的右边。请注意，两个指针只能向前移动。
     *
     * @param s
     * @return: int
     */
    public static int lengthOfLongestSubstring3(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                //从有重复的下一个位置继续找
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            //map每次更新
            map.put(s.charAt(i), i);
            //结果每次更新
            max = Math.max(max, i - j + 1);
            System.out.println();
        }
        return max;
    }

    /**
     在Java中使用Kadane的算法的O（n）时间O（1）空间解决方案:

     如果我们看到位置j处的字符与左边位置i <j处的字符重复，则我们从左到右遍历表格，那么我们知道我们不能再从i开始子字符串了。
     因此，我们需要从i + 1位置开始一个新的子字符串。在执行此操作时，我们还需要更新当前子字符串的长度和当前子字符串的开始。
     此过程的重要部分是确保我们始终保持到目前为止所看到字符的最新位置。以下是此逻辑的简单O（n）实现

     * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了97.43%的用户
     *
     * @param s
     * @return: int
     */
    public static int lengthOfLongestSubstring4(String s) {
        int lastIndices[] = new int[256];
        //不置为-1时，默认值为0，因此当输出s为空格时，计算结果为0，不符合要求（结果应为1）
        for(int i = 0; i<lastIndices.length; i++){
            lastIndices[i] = -1;
        }

        int maxLen = 0;
        int curLen = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            //转ascii，找位置
            char cur = s.charAt(i);
            if (lastIndices[cur] < start) {
                lastIndices[cur] = i;
                curLen++;
            } else {
                int lastIndex = lastIndices[cur];
                start = lastIndex + 1;
                curLen = i - start + 1;
                lastIndices[cur] = i;
            }
            if (curLen > maxLen) {
                maxLen = curLen;
            }
        }
        return maxLen;
    }

}