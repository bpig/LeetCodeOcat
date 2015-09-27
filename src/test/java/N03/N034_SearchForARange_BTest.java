package N03;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-27
 */
public class N034_SearchForARange_BTest {
    N034_SearchForARange_B nb = new N034_SearchForARange_B();

    @Test
    public void testSearchLeft() throws Exception {
        assertEquals(5, nb.searchLeft(new int[]{0, 1, 1, 2, 3, 4, 4, 4}, 0, 7, 4));
    }

    @Test
    public void testSearch() throws Exception {
        assertArrayEquals(new int[]{5, 7}, nb.searchRange(new int[]{0, 1, 1, 2, 3, 4, 4, 4}, 4));
        assertArrayEquals(new int[]{0, 0}, nb.searchRange(new int[]{0}, 0));
        assertArrayEquals(new int[]{0, 1}, nb.searchRange(new int[]{2, 2}, 2));
    }
}