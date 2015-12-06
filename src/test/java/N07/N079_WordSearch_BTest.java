package N07;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */
public class N079_WordSearch_BTest {
    N079_WordSearch_B nb = new N079_WordSearch_B();
    @Test
    public void testExist() throws Exception {
        char[][] board = new char[][] {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        assertTrue(nb.exist(board, "ABCCED"));
        assertTrue(nb.exist(board, "SEE"));
        assertFalse(nb.exist(board, "ABCB"));
    }
}