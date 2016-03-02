package N05;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns),
 * return all elements of the matrix in spiral order.
 * <p>
 * For example,
 * Given the following matrix:
 * [
 * [ 1, 2, 3 ],       0,0 0,1 0,2
 * [ 4, 5, 6 ],       1,0 1,1 1,2
 * [ 7, 8, 9 ]        2,0 2,1 2,2      n = 3
 * ]
 * You should return [1,2,3,6,9,8,7,4,5].
 */

public class N054_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return ans;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int u = 0;
        int d = m - 1;
        int l = 0;
        int r = n - 1;
        while (true) {
            for (int i = l; i <= r; ++i) {
                ans.add(matrix[u][i]);
            }
            if (++u > d) {
                break;
            }
            for (int i = u; i <= d; ++i) {
                ans.add(matrix[i][r]);
            }
            if (--r < l) {
                break;
            }
            for (int i = r; i >= l; --i) {
                ans.add(matrix[d][i]);
            }
            if (--d < u) {
                break;
            }
            for (int i = d; i >= u; --i) {
                ans.add(matrix[i][l]);
            }
            if (++l > r) {
                break;
            }
        }
        return ans;
    }
}
