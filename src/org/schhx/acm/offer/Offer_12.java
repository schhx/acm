package org.schhx.acm.offer;

/**
 * 矩阵中的路径
 * <p>
 * 回溯
 *
 * @author shanchao
 * @date 2019-05-07
 */
public class Offer_12 {
    private static boolean[][] ins;

    public static void main(String[] args) {
        char[][] chars = new char[][]{
                {'a', 'b', 't', 'g'},
                {'c', 'f', 'c', 's'},
                {'j', 'd', 'e', 'h'}
        };
        ins = new boolean[chars.length][chars[0].length];

        System.out.println(path(chars, "abfd", 0, 0));
    }


    public static boolean path(char[][] chars, String path, int row, int col) {
        if (row < 0 || row >= chars.length || col < 0 || col >= chars[0].length || chars[row][col] != path.charAt(0) || ins[row][col]) {
            return false;
        }
        if (path.length() == 1) {
            return true;
        }
        ins[row][col] = true;
        path = path.substring(1);

        return path(chars, path, row + 1, col) || path(chars, path, row - 1, col) ||
                path(chars, path, row, col + 1) || path(chars, path, row, col - 1);

    }
}
