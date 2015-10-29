package N27;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wenwen.xww on 2015/10/29.
 */
public class N279_PerfectSquares_OTest {
    N279_PerfectSquares_O example = new N279_PerfectSquares_O();
    @Test
    public void testNumSquares() throws Exception {
        assertEquals(3, example.numSquares(12));
        assertEquals(2, example.numSquares(13));
        assertEquals(1, example.numSquares(4));
    }
}