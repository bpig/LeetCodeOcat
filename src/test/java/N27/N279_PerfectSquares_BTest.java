package N27;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-10-29
 */
public class N279_PerfectSquares_BTest {
    N279_PerfectSquares_B nb = new N279_PerfectSquares_B();
    @Test
    public void testNumSquares() throws Exception {
        assertEquals(3, nb.numSquares(12));
        assertEquals(2, nb.numSquares(10));
        assertEquals(1, nb.numSquares(4));
        assertEquals(2, nb.numSquares(2));
        assertEquals(3, nb.numSquares(48));
        assertEquals(3, nb.numSquares(9600));
    }
}