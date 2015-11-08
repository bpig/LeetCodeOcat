package N24;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-08
 */
public class N240_SearchA2DMatrixII_BTest {
    N240_SearchA2DMatrixII_B nb = new N240_SearchA2DMatrixII_B();

    @Test
    public void testSearchMatrix() throws Exception {
        int[][] matrix;

        matrix = new int[][]{
                {1, 1}
        };
        assertEquals(false, nb.searchMatrix(matrix, 0));
        assertEquals(false, nb.searchMatrix(matrix, 2));

        matrix = new int[][]{
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 10},
                {11, 13, 15, 17, 19},
                {12, 14, 16, 18, 20},
                {21, 22, 23, 24, 25}
        };
        assertEquals(true, nb.searchMatrix(matrix, 13));
    }
}