package org.schhx.acm.sort;


/**
 * 冒泡排序
 */
public class BobbleSort {

    public static void main(String[] args) {
        int[] a = ArrayUtils.generateIntArray(10, 100);
        System.out.print("原始数组为: ");
        ArrayUtils.printArray(a);
        bubbleSort(a);
        System.out.print("排序后为: ");
        ArrayUtils.printArray(a);
    }

    private static void bubbleSort(int[] a) {
        if (a == null || a.length <= 0) {
            throw new RuntimeException("参数不合法");
        }
        int length = a.length;
        int temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

}
