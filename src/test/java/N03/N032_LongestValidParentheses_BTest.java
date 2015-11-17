package N03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-24
 */
public class N032_LongestValidParentheses_BTest {
    N032_LongestValidParentheses_B nb = new N032_LongestValidParentheses_B();

    @Test
    public void testValidLength() throws Exception {
        assertEquals(4, nb.longestValidParentheses("()()"));
        assertEquals(2, nb.longestValidParentheses(")()(("));
        assertEquals(4, nb.longestValidParentheses("())(())"));
        assertEquals(50, nb.longestValidParentheses("))))())()()))(()()))((())()(()()(((()(()()()()((()(((())())(()(()(()(((()(())(()(()(()))(()())()(((((())())())))))))(((((((()())()(())))(()))))((((()(()(()("));
    }
}