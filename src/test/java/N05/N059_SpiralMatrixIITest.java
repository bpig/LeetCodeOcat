package N05;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */
public class N059_SpiralMatrixIITest {
    N059_SpiralMatrixII nb = new N059_SpiralMatrixII();

    @Test
    public void testGenerateMatrix() throws Exception {
        int[][] expect;
        expect = new int[][]{
                {1, 2},
                {4, 3}
        };
        assertArrayEquals(expect, nb.generateMatrix(2));

        expect = new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };
        assertArrayEquals(expect, nb.generateMatrix(3));

    }
}