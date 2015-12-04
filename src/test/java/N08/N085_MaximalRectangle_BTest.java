package N08;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-04
 */
public class N085_MaximalRectangle_BTest {
    N085_MaximalRectangle_B nb = new N085_MaximalRectangle_B();

    @Test
    public void testMaximalRectangle() throws Exception {
        char[][] matrix;
        matrix = new char[][]{
                {1, 1, 1},
                {0, 0, 0}
        };
        assertEquals(3, nb.maximalRectangle(matrix));
    }
}