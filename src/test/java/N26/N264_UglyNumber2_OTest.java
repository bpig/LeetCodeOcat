package N26;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wenwen.xww on 2015/11/2.
 */
public class N264_UglyNumber2_OTest {
    N264_UglyNumber2_O example = new N264_UglyNumber2_O();
    @Test
    public void testNthUglyNumber() throws Exception {
      //  assertEquals(5, example.nthUglyNumber(5));
        assertEquals(12, example.nthUglyNumber(10));
    }
}