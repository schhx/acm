package org.schhx.acm.leetcode;

/**
 * https://leetcode-cn.com/problems/add-two-numbers/
 *
 * @author shanchao
 * @date 2019-05-05
 */
public class AddTwoNumbers_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode head = node;
        int add = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = val1 + val2 + add;
            add = sum / 10;
            node.next = new ListNode(sum % 10);
            node = node.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (add != 0) {
            node.next = new ListNode(add);
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


