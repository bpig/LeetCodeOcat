package N06;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */
public class N069_sqrtx_BTest {
    N069_sqrtx_B nb = new N069_sqrtx_B();

    @Test
    public void testMySqrt() throws Exception {
        assertEquals(3, nb.mySqrt(9));
        assertEquals(3, nb.mySqrt(11));
        assertEquals(1, nb.mySqrt(1));
        assertEquals(2, nb.mySqrt(8));
        assertEquals(46340, nb.mySqrt(2147483647));
    }
}