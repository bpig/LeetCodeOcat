package N20;

import N21.N210_CourseScheduleII_B;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-18
 */
public class N210_CourseScheduleII_BTest {
    N210_CourseScheduleII_B nb = new N210_CourseScheduleII_B();

    @Test
    public void testFindOrder() throws Exception {
        int[][] edges;
        edges = new int[][]{
                {0, 1}, {1, 2}, {2, 0}
        };
        assertArrayEquals(new int[0], nb.findOrder(3, edges));

        edges = new int[][]{
                {1, 0}, {2, 0}, {3, 1}, {3, 2}
        };
        assertArrayEquals(new int[]{0, 1, 2, 3}, nb.findOrder(4, edges));
    }
}