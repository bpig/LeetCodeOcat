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
        assertEquals(321, nb.myAtoi("321"));
        assertEquals(-321, nb.myAtoi("-321"));
        assertEquals(0, nb.myAtoi("-"));
    }
}