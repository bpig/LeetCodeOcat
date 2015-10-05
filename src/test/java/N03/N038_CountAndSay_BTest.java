package N03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-27
 */
public class N038_CountAndSay_BTest {
    N038_CountAndSay_B nb = new N038_CountAndSay_B();
    @Test
    public void testCountAndSay() throws Exception {
        assertEquals("11", nb.countAndSay(2));
        assertEquals("21", nb.countAndSay(3));
        assertEquals("1211", nb.countAndSay(4));
    }
}