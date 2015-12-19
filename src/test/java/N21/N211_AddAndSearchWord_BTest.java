package N21;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-19
 */
public class N211_AddAndSearchWord_BTest {
    N211_AddAndSearchWord_B nb = new N211_AddAndSearchWord_B();
    @Test
    public void testSearch() throws Exception {
        nb.addWord("bad");
        nb.addWord("dad");
        nb.addWord("mad");
        assertTrue(nb.search("bad"));
        assertFalse(nb.search("pad"));
        assertTrue(nb.search(".ad"));
        assertTrue(nb.search("b.."));

        nb.clear();
        nb.addWord("a");
        nb.addWord("a");
        nb.search(".");
        nb.search("a");
        nb.search("aa");
        nb.search("a");
        nb.search(".a");
        nb.search("a.");
    }
}