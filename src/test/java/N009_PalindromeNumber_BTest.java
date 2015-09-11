import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-11
 */
public class N009_PalindromeNumber_BTest {
    N009_PalindromeNumber_B nb = new N009_PalindromeNumber_B();
    @Test
    public void testIsPalindrome() throws Exception {
        assertTrue(nb.isPalindrome(12321));
    }
}