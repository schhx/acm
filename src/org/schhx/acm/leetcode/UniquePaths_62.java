package org.schhx.acm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shanchao
 * @date 2019-05-14
 */
public class UniquePaths_62 {

    public static void main(String[] args) {
        UniquePaths_62 ss = new UniquePaths_62();
        System.out.println(ss.uniquePaths(3, 6));
        System.out.println(ss.uniquePaths2(3, 6));
        System.out.println(ss.uniquePaths3(3, 6));
    }

    private Map<String, Integer> map = new HashMap<>();

    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        String key = m + "-" + n;
        Integer path = map.get(key);
        if (path != null) {
            return path;
        }

        path = uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
        map.put(key, path);
        return path;
    }


    public int uniquePaths2(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }

        int[][] tmp = new int[m][n];
        for (int i = 0; i < m; i++) {
            tmp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            tmp[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                tmp[i][j] = tmp[i - 1][j] + tmp[i][j - 1];
            }
        }
        return tmp[m - 1][n - 1];
    }

    // C(m+n-2,m-1)
    public int uniquePaths3(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }

        int result = 1;

        int sum = m + n - 2;
        int min = Math.min(m, n);

        for (int i = 1; i <= min - 1; i++) {
            result = result * sum / i;
            sum--;
        }
        return result;
    }
}
