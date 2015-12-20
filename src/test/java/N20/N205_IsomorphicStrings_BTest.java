package N20;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-19
 */
public class N205_IsomorphicStrings_BTest {
    N205_IsomorphicStrings_B nb = new N205_IsomorphicStrings_B();
    @Test
    public void testIsIsomorphic() throws Exception {
        assertTrue(nb.isIsomorphic("egg", "foo"));
        assertFalse(nb.isIsomorphic("foe", "oee"));
        assertFalse(nb.isIsomorphic("aa", "ab"));
    }
}