package N20;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-16
 */

/**
 * Given a 2d grid map of '1's (land) and '0's (water),
 * count the number of islands.
 * An island is surrounded by water and is formed
 * by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 * <p/>
 * Example 1:
 * <p/>
 * 11110
 * 11010
 * 11000
 * 00000
 * Answer: 1
 * <p/>
 * Example 2:
 * <p/>
 * 11000
 * 11000
 * 00100
 * 00011
 * Answer: 3
 */
public class N200_NumberOfIslands_B {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        if (m == 0) {
            return 0;
        }
        int n = grid[0].length;
        if (n == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    clearRestOfLand(grid, i, j);
                }
            }
        }
        return count;
    }

    private void clearRestOfLand(char[][] grid, int i, int j) {
        if (i < 0 || j < 0
                || i >= grid.length || j >= grid[i].length
                || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        clearRestOfLand(grid, i + 1, j);
        clearRestOfLand(grid, i - 1, j);
        clearRestOfLand(grid, i, j + 1);
        clearRestOfLand(grid, i, j - 1);
        return;
    }
}
