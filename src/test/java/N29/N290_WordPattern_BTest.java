package N29;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-10-06
 */
public class N290_WordPattern_BTest {
    N290_WordPattern_B nb = new N290_WordPattern_B();

    @Test
    public void testWordPattern() throws Exception {
        assertTrue(nb.wordPattern("abba", "dog cat cat dog"));
        assertFalse(nb.wordPattern("abba", "dog dog dog dog"));
    }
}