package N20;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-18
 */
public class N207_CourseSchedule_BTest {
    N207_CourseSchedule_B nb = new N207_CourseSchedule_B();

    @Test
    public void testCanFinish() throws Exception {
        int[][] request;
        request = new int[][]{
                {1, 0},
                {0, 1}
        };
        assertFalse(nb.canFinish(2, request));

        request = new int[][]{
                {1, 0},
                {2, 0}
        };
        assertTrue(nb.canFinish(3, request));

        request = new int[][]{
                {1, 0},
                {0, 2},
                {2, 1}
        };
        assertFalse(nb.canFinish(3, request));
    }
}