package N28;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wenwen.xww on 2015/10/6.
 */
public class N289_GameOfLife_OTest {
    N289_GameOfLife_O nb = new N289_GameOfLife_O();
    @Test
    public void testGameOfLife() throws Exception {
        int[][] board = new int[][]{{1, 1}, {1, 0}};
        int[][] expect = new int[][]{{1, 1}, {1, 1}};
        nb.gameOfLife(board);
        assertArrayEquals(expect, board);
    }
}