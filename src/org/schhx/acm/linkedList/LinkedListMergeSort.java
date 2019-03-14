package org.schhx.acm.linkedList;

/**
 * 链表归并排序
 *
 * @author shanchao
 * @date 2019-03-07
 */
public class LinkedListMergeSort {

    public static void main(String[] args) {
        Node head = LinkedListUtil.generateIntLinkedList(10, 100);
        LinkedListUtil.printLinkedList(head);
        LinkedListUtil.printLinkedList(mergeSort(head));

    }

    //单链表的归并排序
    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        //得到链表中间的数
        Node middle = getMiddle(head);
        Node sHalf = middle.next;
        //拆分链表
        middle.next = null;
        //递归调用
        return merge(mergeSort(head), mergeSort(sHalf));
    }


    // 合并排好序的链表
    public static Node merge(Node a, Node b) {
        Node dummyHead, curr;
        dummyHead = new Node(0);
        curr = dummyHead;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                curr.next = a;
                a = a.next;
            } else {
                curr.next = b;
                b = b.next;
            }
            curr = curr.next;
        }
        curr.next = (a == null) ? b : a;
        return dummyHead.next;
    }

    // 找到中间点，然后分割
    public static Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }
        //快慢指针
        Node slow, fast;
        slow = fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


}
