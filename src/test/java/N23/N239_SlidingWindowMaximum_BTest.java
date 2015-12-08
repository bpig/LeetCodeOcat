package N23;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-07
 */
public class N239_SlidingWindowMaximum_BTest {
    N239_SlidingWindowMaximum_B nb = new N239_SlidingWindowMaximum_B();

    @Test
    public void testMaxSlidingWindow() throws Exception {
        int[] data;
        int[] expect;

        data = new int[]{1, -1};
        expect = new int[]{1, -1};
        assertArrayEquals(expect, nb.maxSlidingWindow(data, 1));

        data = new int[]{7, 2, 4};
        expect = new int[]{7, 4};
        assertArrayEquals(expect, nb.maxSlidingWindow(data, 2));

        data = new int[0];
        expect = new int[0];
        assertArrayEquals(expect, nb.maxSlidingWindow(data, 0));
    }
}