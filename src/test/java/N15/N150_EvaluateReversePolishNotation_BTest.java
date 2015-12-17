package N15;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-09
 */
public class N150_EvaluateReversePolishNotation_BTest {
    N150_EvaluateReversePolishNotation_B nb = new N150_EvaluateReversePolishNotation_B();

    @Test
    public void testEvalRPN() throws Exception {
        String[] expression;
        expression = new String[]{"2", "1", "+", "3", "*"};
        assertEquals(9, nb.evalRPN(expression));

        expression = new String[]{"4", "13", "5", "/", "+"};
        assertEquals(6, nb.evalRPN(expression));
    }
}