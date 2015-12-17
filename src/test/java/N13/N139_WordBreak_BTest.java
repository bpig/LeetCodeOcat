package N13;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-09
 */
public class N139_WordBreak_BTest {
    N139_WordBreak_B nb = new N139_WordBreak_B();

    @Test
    public void testWordBreak() throws Exception {
        String s = "leetcode";
        Set<String> dict = new HashSet<>(Arrays.asList("leet", "code"));
        assertTrue(nb.wordBreak(s, dict));
    }
}