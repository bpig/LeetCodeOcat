package N24;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-07
 */
public class N241_DifferentWaysToAddParentheses_BTest {
    N241_DifferentWaysToAddParentheses_B nb = new N241_DifferentWaysToAddParentheses_B();
    @Test
    public void testDiffWaysToCompute() throws Exception {
        List<Integer> expect;
        List<Integer> ret;

        expect = Arrays.asList(2, 0);
        ret = nb.diffWaysToCompute("2-1-1");
        assertEquals(expect, ret);

        expect = Arrays.asList(-34, -10, -14, -10, 10);
        ret = nb.diffWaysToCompute("2*3-4*5");
        assertEquals(expect, ret);
    }
}