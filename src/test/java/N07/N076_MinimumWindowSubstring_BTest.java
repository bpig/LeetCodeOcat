package N07;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-05
 */
public class N076_MinimumWindowSubstring_BTest {
    N076_MinimumWindowSubstring_B nb = new N076_MinimumWindowSubstring_B();
    @Test
    public void testMinWindow() throws Exception {
        assertEquals("ab", nb.minWindow("aab", "ab"));
        assertEquals("BANC", nb.minWindow("ADOBECODEBANC", "ABC"));
        assertEquals("a", nb.minWindow("a", "a"));
        assertEquals("cwae", nb.minWindow("zcabwefgewcwaefgcf", "cae"));
    }
}