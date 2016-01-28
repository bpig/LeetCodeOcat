package N02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-28
 */
public class N029_DivideTwoIntegersTest {
    N029_DivideTwoIntegers nb = new N029_DivideTwoIntegers();

    @Test
    public void testDivide() throws Exception {
        assertEquals(3, nb.divide(7, 2));
        assertEquals(0, nb.divide(-1010369383, -2147483648));
    }
}