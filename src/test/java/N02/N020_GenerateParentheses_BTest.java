package N02;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-16
 */
public class N020_GenerateParentheses_BTest {
    N020_GenerateParentheses_B nb = new N020_GenerateParentheses_B();

    @Test
    public void testGenerateParenthesis() throws Exception {
        Set<String> expect = new HashSet<>(Arrays.asList("()()", "(())"));
        Set<String> set = new HashSet<>(nb.generateParenthesis(2));
        assertEquals(expect, set);

        expect = new HashSet<>(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"));
        set = new HashSet<>(nb.generateParenthesis(3));
        assertEquals(expect, set);

        expect = new HashSet<>(Arrays.asList("(((())))", "((()()))", "((())())", "((()))()",
                "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()"));
        set = new HashSet<>(nb.generateParenthesis(4));
        assertEquals(expect, set);
    }
}