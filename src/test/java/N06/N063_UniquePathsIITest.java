package N06;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-05
 */
public class N063_UniquePathsIITest {
    N063_UniquePathsII nb = new N063_UniquePathsII();

    @Test
    public void testUniquePathsWithObstacles() throws Exception {
        int[][] grid = new int[][]{{1}};
        assertEquals(0, nb.uniquePathsWithObstacles(grid));
    }
}