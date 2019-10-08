package org.schhx.acm.offer;

import org.schhx.acm.BinaryTreeNode;

import java.util.LinkedList;

/**
 * 从上到下打印二叉树
 *
 * @author shanchao
 * @date 2019-05-08
 */
public class Offer_32 {

    public static void main(String[] args) {
        BinaryTreeNode node1 = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(3);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(5);
        BinaryTreeNode node6 = new BinaryTreeNode(6);
        BinaryTreeNode node7 = new BinaryTreeNode(7);
        BinaryTreeNode node8 = new BinaryTreeNode(8);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node5.left = node6;
        node5.right = node7;
        node7.right = node8;

        print3(node1);

    }


    // 打印在一行
    public static void print(BinaryTreeNode node) {
        LinkedList<BinaryTreeNode> linkedList = new LinkedList();

        linkedList.addFirst(node);

        while (linkedList.size() > 0) {
            BinaryTreeNode last = linkedList.removeLast();
            System.out.print(last.value + " ");
            if(last.left != null) {
                linkedList.addFirst(last.left);
            }
            if(last.right != null) {
                linkedList.addFirst(last.right);
            }
        }
    }


    // 按层打印
    public static void print2(BinaryTreeNode node) {
        LinkedList<BinaryTreeNode> linkedList = new LinkedList();

        linkedList.addFirst(node);

        int currentCount = 1;
        int nextCount = 0;

        while (linkedList.size() > 0) {
            BinaryTreeNode last = linkedList.removeLast();
            System.out.print(last.value + " ");
            currentCount--;
            if(last.left != null) {
                linkedList.addFirst(last.left);
                nextCount++;
            }
            if(last.right != null) {
                linkedList.addFirst(last.right);
                nextCount++;
            }
            if(currentCount == 0) {
                currentCount = nextCount;
                nextCount = 0;
                System.out.println();
            }
        }
    }

    // Z字按层打印
    public static void print3(BinaryTreeNode node) {
        LinkedList<BinaryTreeNode> linkedList = new LinkedList();

        linkedList.addFirst(node);

        int currentCount = 1;
        int nextCount = 0;
        int level = 1;

        while (linkedList.size() > 0) {
            BinaryTreeNode last = linkedList.removeLast();
            System.out.print(last.value + " ");
            currentCount--;
            if(level % 2 == 0) {
                if (last.left != null) {
                    linkedList.addFirst(last.left);
                    nextCount++;
                }
                if (last.right != null) {
                    linkedList.addFirst(last.right);
                    nextCount++;
                }
            } else {
                if (last.right != null) {
                    linkedList.addFirst(last.right);
                    nextCount++;
                }
                if (last.left != null) {
                    linkedList.addFirst(last.left);
                    nextCount++;
                }
            }
            if(currentCount == 0) {
                currentCount = nextCount;
                nextCount = 0;
                System.out.println();
                level++;
            }
        }
    }
}
