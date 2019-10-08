package org.schhx.acm.sort;

import org.schhx.acm.ArrayUtils;

/**
 * 插入排序
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] a = ArrayUtils.generateIntArray(10, 100);
        System.out.print("原始数组为: ");
        ArrayUtils.printArray(a);
        insertionSort(a);
        System.out.print("排序后为: ");
        ArrayUtils.printArray(a);
    }

    public static void insertionSort(int[] a) {
        if (a == null || a.length <= 0) {
            throw new RuntimeException("参数不合法");
        }
        int length = a.length;
        for (int i = 1; i < length; i++) {
            int tmp = a[i];
            int j = i;
            for (; j > 0; j--) {
                if (a[j - 1] > tmp) {
                    a[j] = a[j - 1];
                } else {
                    break;
                }
            }
            a[j] = tmp;
        }
    }
}
