package N02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-17
 */
public class N029_DivideTwoIntegers_BTest {
    N029_DivideTwoIntegers_B nb = new N029_DivideTwoIntegers_B();
    @Test
    public void testDivide() throws Exception {
        assertEquals(-1, nb.divide(1, -1));
    }
}