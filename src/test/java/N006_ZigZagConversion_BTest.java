import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-10
 */
public class N006_ZigZagConversion_BTest {
    N006_ZigZagConversion_B nb = new N006_ZigZagConversion_B();
    @Test
    public void test() {
        String str = nb.convert("PAYPALISHIRING", 3);
        String expect = "PAHNAPLSIIGYIR";
        assertEquals(expect, str);
    }

    @Test
    public void test4() {
        String str = nb.score0("PAYPALISHIRING", 3);
        String expect = "PAHNAPLSIIGYIR";
        assertEquals(expect, str);
    }

}