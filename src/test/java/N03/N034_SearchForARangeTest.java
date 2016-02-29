package N03;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-27
 */
public class N034_SearchForARangeTest {
    N034_SearchForARange nb = new N034_SearchForARange();

    @Test
    public void testSearchRange() throws Exception {
        int[] num = new int[]{5, 7, 7, 8, 8, 10};
        assertArrayEquals(new int[]{3, 4}, nb.searchRange(num, 8));
    }
}