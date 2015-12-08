package N22;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-08
 */

/**
 * Given a 2D binary matrix filled with 0's and 1's,
 * find the largest square containing all 1's and return its area.
 * <p/>
 * For example, given the following matrix:
 * <p/>
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 * Return 4.
 */
public class N221_MaximalSquare_B {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] ans = new int[n][m];
        int width = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0) {
                    ans[i][j] = matrix[i][j] - '0';
                } else if (matrix[i][j] == '0') {
                    ans[i][j] = 0;
                } else {
                    int w = Math.min(ans[i - 1][j], ans[i][j - 1]);
                    w = Math.min(w, ans[i - 1][j - 1]) + 1;
                    ans[i][j] = w;
                }
                width = width < ans[i][j] ? ans[i][j] : width;
            }
        }
        return width * width;
    }
    // not neat, but fast
    public int scoreB(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (matrix[i][j] == '0') {
                    continue;
                }
                int w = Math.min(m - j, n - i);
                int k = 1;
                boolean flag = true;
                for (; k < w; ++k) {
                    for (int x = i; x <= i + k; ++x) {
                        if (matrix[x][j + k] == '0') {
                            flag = false;
                            break;
                        }
                    }
                    for (int x = j; x <= j + k; ++x) {
                        if (matrix[i + k][x] == '0') {
                            flag = false;
                            break;
                        }
                    }
                    if (!flag) {
                        break;
                    }
                }
                ans = Math.max(ans, k * k);
            }
        }
        return ans;
    }
}