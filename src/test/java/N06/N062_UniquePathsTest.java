package N06;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-05
 */
public class N062_UniquePathsTest {
    N062_UniquePaths nb = new N062_UniquePaths();

    @Test
    public void testUniquePaths() throws Exception {
        assertEquals(3, nb.uniquePaths(3, 2));
        assertEquals(3, nb.uniquePaths(2, 3));
    }
}