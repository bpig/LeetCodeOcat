package N24;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-08
 */

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix.
 * This matrix has the following properties:
 * <p/>
 * Integers in each row are sorted in ascending from left to right.
 * Integers in each column are sorted in ascending from top to bottom.
 * For example,
 * <p/>
 * Consider the following matrix:
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * Given target = 5, return true.
 * <p/>
 * Given target = 20, return false.
 */
public class N240_SearchA2DMatrixII_B {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            int val = matrix[i][j];
            if (val == target) {
                return true;
            } else if (val < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
