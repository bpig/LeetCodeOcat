package N13;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-09
 */
public class N131_PalindromePartitioning_BTest {
    N131_PalindromePartitioning_B nb = new N131_PalindromePartitioning_B();

    @Test
    public void testIsPalindrome() throws Exception {
        List<List<String>> expect;
        expect = new ArrayList<>();
        expect.add(Arrays.asList("a", "a", "b"));
        expect.add(Arrays.asList("aa", "b"));
        assertEquals(expect, nb.partition("aab"));
    }
}