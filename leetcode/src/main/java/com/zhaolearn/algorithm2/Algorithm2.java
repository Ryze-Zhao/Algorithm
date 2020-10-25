package com.zhaolearn.algorithm2;

import java.util.HashMap;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Algorithm2 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode listNode = addTwoNumbers(listNode1, listNode2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return null;
    }

    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了27.92%的用户
     * 内存消耗：38.9 MB, 在所有 Java 提交中击败了23.47%的用户
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

        // 注意事项：
        // 1、链表为空判断，2个为空，1个为空
        // 2、进位处理
        // 3、2个链表同时结束，进位大于0，则需要新增节点

        // 定义出参链表
        ListNode result = new ListNode(0);
        ListNode p = result;
        //carry用于记录进位
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            int tmp = sum % 10;
            carry = sum / 10;
            p.next = new ListNode(tmp);
            p = p.next;
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return result.next;
    }

    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了99.92%的用户
     * 内存消耗：38.8 MB, 在所有 Java 提交中击败了73.47%的用户
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        //代表进位
        int carry = 0;
        while (l1 != null || l2 != null) {
            int d1 = l1 == null ? 0 : l1.val;
            int d2 = l2 == null ? 0 : l2.val;
            //计算该位的和
            int sum = d1 + d2 + carry;
            //计算是否进位
            carry = sum >= 10 ? 1 : 0;
            //计算结果放入next中
            cur.next = new ListNode(sum % 10);
            //切换到next中
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry == 1) cur.next = new ListNode(1);
        return dummy.next;
    }
}


/**
 * ListNode
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}