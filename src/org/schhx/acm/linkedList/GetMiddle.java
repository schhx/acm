package org.schhx.acm.linkedList;

/**
 * @author shanchao
 * @date 2019-03-11
 */
public class GetMiddle {

    public static void main(String[] args) {
        Node head = LinkedListUtil.generateIntLinkedList(10, 100);
        LinkedListUtil.printLinkedList(head);
        System.out.println(getMiddle(head).val);
    }

    public static Node getMiddle(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
