package N26;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-01
 */
public class N264_UglyNumberII_BTest {
    N264_UglyNumberII_B nb = new N264_UglyNumberII_B();
    @Test
    public void testNthUglyNumber() throws Exception {
        assertEquals(12, nb.nthUglyNumber(10));
        assertEquals(32, nb.nthUglyNumber(19));
    }
}