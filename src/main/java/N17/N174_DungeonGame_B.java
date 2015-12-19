package N17;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-14
 */

/**
 * The demons had captured the princess (P)
 * and imprisoned her in the bottom-right corner of a dungeon.
 * The dungeon consists of M x N rooms laid out in a 2D grid.
 * Our valiant knight (K) was initially positioned in the top-left room
 * and must fight his way through the dungeon to rescue the princess.
 * <p/>
 * The knight has an initial health point represented by a positive integer.
 * If at any point his health point drops to 0 or below, he dies immediately.
 * <p/>
 * Some of the rooms are guarded by demons,
 * so the knight loses health (negative integers) upon entering these rooms;
 * other rooms are either empty (0's) or contain magic orbs
 * that increase the knight's health (positive integers).
 * <p/>
 * In order to reach the princess as quickly as possible,
 * the knight decides to move only rightward or downward in each step.
 * <p/>
 * <p/>
 * Write a function to determine the knight's minimum initial health
 * so that he is able to rescue the princess.
 * <p/>
 * https://leetcode.com/problems/dungeon-game/
 */
public class N174_DungeonGame_B {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;

        for (int i = m - 1; i >= 0; --i) {
            for (int j = n - 1; j >= 0; --j) {
                if (i == m - 1 && j == n - 1) {
                    dungeon[i][j] = dungeon[i][j] > 0 ? 1 : 1 - dungeon[i][j];
                } else if (i == m - 1) {
                    int gap = dungeon[i][j + 1] - dungeon[i][j];
                    dungeon[i][j] = gap > 0 ? gap : 1;
                } else if (j == n - 1) {
                    int gap = dungeon[i + 1][j] - dungeon[i][j];
                    dungeon[i][j] = gap > 0 ? gap : 1;
                } else {
                    int gap1 = dungeon[i][j + 1] - dungeon[i][j];
                    int gap2 = dungeon[i + 1][j] - dungeon[i][j];
                    int gap = Math.min(gap1, gap2);
                    dungeon[i][j] = gap > 0 ? gap : 1;
                }
            }
        }
        return dungeon[0][0];
    }
}
