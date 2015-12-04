package N08;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-04
 */
public class N084_LargestRectangleInHistogram_BTest {
    N084_LargestRectangleInHistogram_B nb = new N084_LargestRectangleInHistogram_B();

    @Test
    public void testLargestRectangleArea() throws Exception {
        int[] height;
        height = new int[]{2, 1, 5, 6, 2, 3};
        assertEquals(10, nb.largestRectangleArea(height));
    }
}