import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-13
 */
public class N014_LongestCommonPrefix_BTest {
    N014_LongestCommonPrefix_B nb = new N014_LongestCommonPrefix_B();
    @Test
    public void testLongestCommonPrefix() throws Exception {
        String[] strs = new String[] {
                "a", "b"
        };
        assertEquals("", nb.longestCommonPrefix(strs));
    }
}