package N05;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-29
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns),
 * return all elements of the matrix in spiral order.
 * <p/>
 * For example,
 * Given the following matrix:
 * <p/>
 * [
 * [ 1, 2, 3 ],       0,0 0,1 0,2
 * [ 4, 5, 6 ],       1,0 1,1 1,2
 * [ 7, 8, 9 ]        2,0 2,1 2,2      n = 3
 * ]
 * You should return [1,2,3,6,9,8,7,4,5].
 */
public class N054_SpiralMatrix_B {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int u = 0;
        int d = m - 1;
        int l = 0;
        int r = n - 1;
        List<Integer> ans = new ArrayList<>(m * n);
        while (true) {
            for (int col = l; col <= r; ++col) {
                ans.add(matrix[u][col]);
            }
            if (++u > d) {
                break;
            }
            for (int row = u; row <= d; ++row) {
                ans.add(matrix[row][r]);
            }
            if (--r < l) {
                break;
            }
            for (int col = r; col >= l; --col) {
                ans.add(matrix[d][col]);
            }
            if (--d < u) {
                break;
            }
            for (int row = d; row >= u; --row) {
                ans.add(matrix[row][l]);
            }
            if (++l > r) {
                break;
            }
        }
        return ans;
    }
}
