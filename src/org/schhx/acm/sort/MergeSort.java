package org.schhx.acm.sort;

/**
 * 归并排序
 *
 * @author shanchao
 * @date 2019-03-07
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] a = SortUtils.generateIntArray(10, 100);
        System.out.print("原始数组为: ");
        SortUtils.printArray(a);
        mergeSort(a);
        System.out.print("排序后为: ");
        SortUtils.printArray(a);
    }


    private static void mergeSort(int[] a) {
        if (a == null || a.length <= 0) {
            throw new RuntimeException("参数不合法");
        }
        sortInternal(a, 0, a.length - 1);

    }

    private static void sortInternal(int[] a, int p, int q) {
        if (p >= q) {
            return;
        }
        int m = p + (q - p) / 2;
        sortInternal(a, p, m);
        sortInternal(a, m + 1, q);
        merge(a, p, m, q);
    }


    // 将a[p,m] a[m+1,q] 合并成a[p,q]
    private static void merge(int[] a, int p, int m, int q) {
        int[] tmp = new int[q - p + 1];
        int i = p;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= q) {
            if (a[i] <= a[j]) {
                tmp[k++] = a[i++];
            } else {
                tmp[k++] = a[j++];
            }
        }

        while (i <= m) {
            tmp[k++] = a[i++];
        }

        while (j <= q) {
            tmp[k++] = a[j++];
        }

        k = 0;
        while (p <= q) {
            a[p++] = tmp[k++];
        }
    }
}
