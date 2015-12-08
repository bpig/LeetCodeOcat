package N22;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-08
 */
public class N223_RectangleArea_BTest {
    N223_RectangleArea_B nb = new N223_RectangleArea_B();

    @Test
    public void testComputeArea() throws Exception {
        assertEquals(45, nb.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
        assertEquals(17, nb.computeArea(-2, -2, 2, 2, 3, 3, 4, 4));
        assertEquals(41, nb.computeArea(-3, -3, 3, 3, -5, -5, -4, 0));
    }
}