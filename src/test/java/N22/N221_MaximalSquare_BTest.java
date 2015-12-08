package N22;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-08
 */
public class N221_MaximalSquare_BTest {
    N221_MaximalSquare_B nb = new N221_MaximalSquare_B();

    @Test
    public void testMaximalSquare() throws Exception {
        char[][] matrix;
        matrix = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        assertEquals(4, nb.maximalSquare(matrix));

        matrix = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        assertEquals(9, nb.maximalSquare(matrix));

    }
}