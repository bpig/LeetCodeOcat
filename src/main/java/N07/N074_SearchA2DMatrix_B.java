package N07;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-08
 */

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix.
 * This matrix has the following properties:
 * <p/>
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * For example,
 * <p/>
 * Consider the following matrix:
 * <p/>
 * [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * Given target = 3, return true.
 */
public class N074_SearchA2DMatrix_B {
    public int getValue(int[][] matrix, int num) {
        int n = matrix[0].length;
        int row = num / n;
        int col = num % n;
        return matrix[row][col];
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int lo = 0;
        int hi = m * n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int val = getValue(matrix, mid);
            if (val == target) {
                return true;
            } else if (val < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
    }
}
