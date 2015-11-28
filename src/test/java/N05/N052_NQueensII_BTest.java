package N05;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-28
 */
public class N052_NQueensII_BTest {
    N052_NQueensII_B nb = new N052_NQueensII_B();
    @Test
    public void testTotalNQueens() throws Exception {
        assertEquals(2, nb.totalNQueens(4));
    }
}