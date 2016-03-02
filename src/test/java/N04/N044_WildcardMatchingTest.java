package N04;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-01
 */
public class N044_WildcardMatchingTest {
    N044_WildcardMatching nb = new N044_WildcardMatching();

    @Test(timeout = 1000)
    public void testIsMatch() throws Exception {
        assertFalse(nb.isMatch("aa", "a"));
        assertTrue(nb.isMatch("aa", "aa"));
        assertFalse(nb.isMatch("aaa", "aa"));
        assertTrue(nb.isMatch("aa", "a*"));
        assertTrue(nb.isMatch("aa", "?*"));
        assertFalse(nb.isMatch("aab", "c*a*b"));
        assertTrue(nb.isMatch("ab", "*"));
        assertTrue(nb.isMatch("abb", "a*b"));
        assertTrue(nb.isMatch("abb", "a**"));
        assertTrue(nb.isMatch("abbb", "a**b"));
        assertTrue(nb.isMatch("abbb", "a*b*"));
        assertFalse(nb.isMatch(
                "aaabbbaabaaaaababaabaaabbabbbbbbbbaabababbabbbaaaaba",
                "a*******b"));
    }
}