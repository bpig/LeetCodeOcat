import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-10
 */
public class N007_ReverseInteger_BTest {
    N007_ReverseInteger_B nb = new N007_ReverseInteger_B();
    @Test
    public void testReverse() throws Exception {
        assertEquals(1, nb.reverse(100));
        assertEquals(123, nb.reverse(321));
        assertEquals(-8243, nb.reverse(-3428));
    }
}