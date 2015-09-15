package N00;

import N00.N008_StringToInteger_B;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-11
 */
public class N008_StringToInteger_BTest {
    N008_StringToInteger_B nb = new N008_StringToInteger_B();
    @Test
    public void testMyAtoi() throws Exception {
//        assertEquals(321, nb.myAtoi("321"));
//        assertEquals(321, nb.myAtoi("+321"));
//        assertEquals(-12, nb.myAtoi(" -0012a42"));
//        assertEquals(-321, nb.myAtoi("-321"));
//        assertEquals(0, nb.myAtoi("-"));
        assertEquals(2147483647, nb.myAtoi("9223372036854775809"));
        assertEquals(-2147483648, nb.myAtoi("-2147483648"));
        assertEquals(2147483647, nb.myAtoi("2147483648"));
    }
}