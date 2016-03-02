package N05;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */
public class N052_NQueensIITest {
    N052_NQueensII nb = new N052_NQueensII();

    @Test
    public void testTotalNQueens() throws Exception {
        assertEquals(2, nb.totalNQueens(4));
    }
}