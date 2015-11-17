package N04;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-17
 */
public class N044_WildcardMatching_BTest {
    N044_WildcardMatching_B nb = new N044_WildcardMatching_B();

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