package N02;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-28
 */
public class N020_ValidParenthesesTest {
    N020_ValidParentheses nb = new N020_ValidParentheses();

    @Test
    public void testIsValid() throws Exception {
        assertTrue(nb.isValid("[[[{(){}}]]]"));
    }
}