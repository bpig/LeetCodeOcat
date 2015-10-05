package N24;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-10-05
 */
public class N242_ValidAnagram_BTest {
    N242_ValidAnagram_B nb = new N242_ValidAnagram_B();
    @Test
    public void testIsAnagram() throws Exception {
        assertTrue(nb.isAnagram("abc", "cba"));
        assertTrue(nb.isAnagram("", ""));

        assertTrue(nb.scoreTop("abc", "cba"));
        assertTrue(nb.scoreTop("", ""));
    }
}