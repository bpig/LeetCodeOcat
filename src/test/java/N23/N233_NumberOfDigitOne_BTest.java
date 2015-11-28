package N23;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-28
 */
public class N233_NumberOfDigitOne_BTest {
    N233_NumberOfDigitOne_B nb = new N233_NumberOfDigitOne_B();
    @Test
    public void testCountDigitOne() throws Exception {
        assertEquals(6, nb.countDigitOne(13));
        assertEquals(0, nb.countDigitOne(0));
        assertEquals(1, nb.countDigitOne(1));
        assertEquals(1, nb.countDigitOne(2));
        assertEquals(2, nb.countDigitOne(10));
        assertEquals(12, nb.countDigitOne(20));
        assertEquals(13, nb.countDigitOne(23));
        assertEquals(13, nb.countDigitOne(30));
        assertEquals(21, nb.countDigitOne(100));
        assertEquals(301, nb.countDigitOne(1000));
    }
}