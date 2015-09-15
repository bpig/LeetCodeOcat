package N00;

import N00.N003_LongestSubstringWithoutRepeatingCharacters_B;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-08
 */
public class N003_LongestSubstringWithoutRepeatingCharacters_BTest {
    private N003_LongestSubstringWithoutRepeatingCharacters_B nb
            = new N003_LongestSubstringWithoutRepeatingCharacters_B();
    @Test
    public void test() {
        assertEquals(3, nb.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, nb.lengthOfLongestSubstring("c"));
    }
}