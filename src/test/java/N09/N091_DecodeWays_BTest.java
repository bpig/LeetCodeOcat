package N09;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-02
 */
public class N091_DecodeWays_BTest {
    N091_DecodeWays_B nb = new N091_DecodeWays_B();
    @Test
    public void testNumDecodings() throws Exception {
        assertEquals(1, nb.numDecodings("20104"));
        assertEquals(3, nb.numDecodings("23124"));
        assertEquals(1, nb.numDecodings("1"));
        assertEquals(2, nb.numDecodings("12"));
        assertEquals(3, nb.numDecodings("123"));
    }
}