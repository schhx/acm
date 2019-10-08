package org.schhx.acm.leetcode;

/**
 * https://leetcode-cn.com/problems/add-two-numbers/
 *
 * @author shanchao
 * @date 2019-05-05
 */
public class AddTwoNumbers_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        int add = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + add;
            int val = sum % 10;
            add = sum - val;
            dummy.next = new ListNode(val);
            l1 = l1.next;
            l2 = l2.next;
            dummy = dummy.next;

        }
        return head.next;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}


