package N05;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */

/**
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 * <p>
 * For example,
 * Given n = 3,
 * <p>
 * You should return the following matrix:
 * [
 * [ 1, 2, 3 ],
 * [ 8, 9, 4 ],
 * [ 7, 6, 5 ]
 * ]
 */
public class N059_SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int u = 0;
        int d = n - 1;
        int l = 0;
        int r = n - 1;
        int num = 1;
        while (true) {
            for (int i = l; i <= r; ++i) {
                ans[u][i] = num++;
            }
            if (++u > d) {
                break;
            }
            for (int i = u; i <= d; ++i) {
                ans[i][r] = num++;
            }
            if (--r < l) {
                break;
            }
            for (int i = r; i >= l; --i) {
                ans[d][i] = num++;
            }
            if (--d < u) {
                break;
            }
            for (int i = d; i >= u; --i) {
                ans[i][l] = num++;
            }
            if (++l > r) {
                break;
            }
        }
        return ans;
    }
}
