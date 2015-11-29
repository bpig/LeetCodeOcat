package N05;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-29
 */
public class N054_SpiralMatrix_BTest {
    N054_SpiralMatrix_B nb = new N054_SpiralMatrix_B();

    @Test
    public void testSpiralOrder() throws Exception {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expect = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        assertEquals(expect, nb.spiralOrder(matrix));
    }
}