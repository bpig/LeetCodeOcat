package N02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-28
 */
public class N022_GenerateParenthesesTest {
    N022_GenerateParentheses nb = new N022_GenerateParentheses();

    @Test
    public void testGenerateParenthesis() throws Exception {
        List<String> expect;

        expect = new ArrayList<String>() {{
            add("(())");
            add("()()");
        }};
        assertEquals(expect, nb.generateParenthesis(2));

        expect = new ArrayList<String>() {{
            add("((()))");
            add("(()())");
            add("(())()");
            add("()(())");
            add("()()()");
        }};
        assertEquals(expect, nb.generateParenthesisRecur(3));

    }
}