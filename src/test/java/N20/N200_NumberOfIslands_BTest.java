package N20;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-17
 */
public class N200_NumberOfIslands_BTest {
    N200_NumberOfIslands_B nb = new N200_NumberOfIslands_B();

    @Test
    public void testNumIslands() throws Exception {
        char[][] grid;
        grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, nb.numIslands(grid));

        grid = new char[][]{
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}
        };
        assertEquals(1, nb.numIslands(grid));
    }
}