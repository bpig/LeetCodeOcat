package N08;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-04
 */
public class N087_ScrambleString_BTest {
    N087_ScrambleString_B nb = new N087_ScrambleString_B();

    @Test
    public void testIsScramble() throws Exception {
        assertTrue(nb.isScramble("xstjzkfpkggnhjzkpfjoguxvkbuopi",
                "xbouipkvxugojfpkzjhnggkpfkzjts"));
        assertFalse(nb.isScramble("b", "s"));
        assertTrue(nb.isScramble("great",
                "grtae"));
    }
}