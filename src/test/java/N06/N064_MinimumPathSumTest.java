package N06;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-05
 */
public class N064_MinimumPathSumTest {
    N064_MinimumPathSum nb = new N064_MinimumPathSum();

    @Test
    public void testMinPathSum() throws Exception {
        int[][] grid = new int[][]{
                {1, 2},
                {1, 1}
        };
        assertEquals(3, nb.minPathSum(grid));
    }
}