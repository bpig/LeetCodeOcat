package N02;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-16
 */
public class N022_ValidParentheses_BTest {
    N022_ValidParentheses_B nb = new N022_ValidParentheses_B();
    @Test
    public void testIsValid() throws Exception {
        assertTrue(nb.isValid("()[]{}"));
        assertFalse(nb.isValid("([)]"));
    }
}