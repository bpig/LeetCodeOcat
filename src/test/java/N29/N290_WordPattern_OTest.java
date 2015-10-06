package N29;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wenwen.xww on 2015/10/6.
 */
public class N290_WordPattern_OTest {

    @Test
    public void testWordPattern() throws Exception {
        N290_WordPattern_O wp = new N290_WordPattern_O();
        assertTrue(wp.wordPattern("abba", "dog cat cat dog"));
        assertFalse(wp.wordPattern("abba", "dog cat cat fish"));
        assertFalse(wp.wordPattern("aaaa", "dog cat cat dog"));
        assertFalse(wp.wordPattern("abba", "dog dog dog dog"));
    }
}