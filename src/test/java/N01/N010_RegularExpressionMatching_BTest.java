package N01;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-11
 */
public class N010_RegularExpressionMatching_BTest {
    N010_RegularExpressionMatching_B nb = new N010_RegularExpressionMatching_B();

    @Test
    public void testIsMatch() throws Exception {
        assertFalse(nb.isMatch("aa", "a"));
        assertTrue(nb.isMatch("aa", "aa"));
        assertFalse(nb.isMatch("aaa", "aa"));
        assertTrue(nb.isMatch("aa", "a*"));
        assertTrue(nb.isMatch("aa", ".*"));
        assertTrue(nb.isMatch("ab", ".*"));
        assertTrue(nb.isMatch("aab", "c*a*b"));
        assertFalse(nb.isMatch("ab", ".*c"));
        assertTrue(nb.isMatch("aaa", "a*a"));
        assertTrue(nb.isMatch("aaa", "a.*a"));
    }

}