package N28;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-10-05
 */
public class N289_GameOfLife_BTest {
    N289_GameOfLife_B nb = new N289_GameOfLife_B();

    @Test
    public void testGameOfLife() throws Exception {
        int[][] board = new int[][]{{1, 1}, {1, 0}};
        int[][] expect = new int[][]{{1, 1}, {1, 1}};
        nb.gameOfLife(board);
        assertArrayEquals(expect, board);
    }
}