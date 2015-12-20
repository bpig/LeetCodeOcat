package N30;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-20
 */
public class N304_RangeSumQuery2D_BTest {

    @Test
    public void testSumRegion() throws Exception {
        int[][] matrix;
        matrix = new int[][]{
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        N304_RangeSumQuery2D_B nb = new N304_RangeSumQuery2D_B(matrix);
        assertEquals(8, nb.sumRegion(2, 1, 4, 3));
        assertEquals(11, nb.sumRegion(1, 1, 2, 2));
        assertEquals(12, nb.sumRegion(1, 2, 2, 4));
    }
}