package org.schhx.acm.priorityqueue;

import org.schhx.acm.ArrayUtils;
import org.schhx.acm.sort.QuickSort;

import java.util.PriorityQueue;

/**
 * 第 K 大数据元素
 *
 * @author shanchao
 * @date 2019-03-19
 */
public class KthLargest {
    private static PriorityQueue<Integer> priorityQueue = null;
    private static int K;


    public static void main(String[] args) {
        int[] a = ArrayUtils.generateIntArray(30, 100);
        QuickSort.quickSort(a);
        ArrayUtils.printArray(a);
        System.out.println(kthLargest(5, a));

    }

    private static int kthLargest(int k, int[] a) {
        if (a == null || a.length == 0) {
            throw new RuntimeException("参数不合法");
        }
        priorityQueue = new PriorityQueue<>(k);
        K = k;

        for (int num : a) {
            add(num);
        }
        return priorityQueue.peek();
    }

    private static int add(int num) {
        if (priorityQueue.size() < K) {
            priorityQueue.offer(num);
        } else if (priorityQueue.peek() < num) {
            priorityQueue.poll();
            priorityQueue.offer(num);
        }
        return priorityQueue.peek();
    }
}
