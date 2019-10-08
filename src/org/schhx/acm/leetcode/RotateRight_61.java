package org.schhx.acm.leetcode;

/**
 * @author shanchao
 * @date 2019-05-14
 */
public class RotateRight_61 {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        int length = 1;
        ListNode listNode = head;
        while (listNode.next != null) {
            length++;
            listNode = listNode.next;
        }

        k = k % length;

        if (k == 0) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode next = slow.next;
        fast.next = head;
        slow.next = null;
        return next;
    }
}