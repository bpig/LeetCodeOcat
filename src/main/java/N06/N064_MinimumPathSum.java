package N06;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-05
 */

/**
 * Given a m x n grid filled with non-negative numbers,
 * find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 * <p>
 * Note: You can only move either down or right at any point in time.
 */
public class N064_MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] path = new int[n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (j == 0) {
                    path[j] += grid[i][j];
                } else if (i == 0) {
                    path[j] = path[j - 1] + grid[i][j];
                } else {
                    path[j] = Math.min(path[j - 1], path[j]) + grid[i][j];
                }
            }
        }
        return path[n - 1];
    }
}
