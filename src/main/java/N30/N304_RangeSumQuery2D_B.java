package N30;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-20
 */

/**
 * Given a 2D matrix matrix,
 * find the sum of the elements inside the rectangle
 * defined by its upper left corner (row1, col1)
 * and lower right corner (row2, col2).
 * <p/>
 * Range Sum Query 2D
 * The above rectangle (with the red border)
 * is defined by (row1, col1) = (2, 1) and (row2, col2) = (4, 3),
 * which contains sum = 8.
 * <p/>
 * Example:
 * Given matrix = [
 * [3, 0, 1, 4, 2],
 * [5, 6, 3, 2, 1],
 * [1, 2, 0, 1, 5],
 * [4, 1, 0, 1, 7],
 * [1, 0, 3, 0, 5]
 * ]
 * <p/>
 * sumRegion(2, 1, 4, 3) -> 8
 * sumRegion(1, 1, 2, 2) -> 11
 * sumRegion(1, 2, 2, 4) -> 12
 * Note:
 * You may assume that the matrix does not change.
 * There are many calls to sumRegion function.
 * You may assume that row1 ≤ row2 and col1 ≤ col2.
 */
public class N304_RangeSumQuery2D_B {
    int[][] sum;

    public N304_RangeSumQuery2D_B(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) {
            return;
        }
        int n = matrix[0].length;
        if (n == 0) {
            return;
        }
        sum = new int[m + 1][n + 1];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                sum[i + 1][j + 1] = sum[i][j + 1] + sum[i + 1][j]
                        + matrix[i][j] - sum[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum == null ? 0 : sum[row2 + 1][col2 + 1] + sum[row1][col1]
                - sum[row2 + 1][col1] - sum[row1][col2 + 1];
    }
}
