package N16;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-14
 */
public class N166_FractionToRecurringDecimal_BTest {
    N166_FractionToRecurringDecimal_B nb = new N166_FractionToRecurringDecimal_B();

    @Test
    public void testFractionToDecimal() throws Exception {
        assertEquals("0.5", nb.fractionToDecimal(1, 2));
        assertEquals("0.(6)", nb.fractionToDecimal(2, 3));
        assertEquals("0.(142857)", nb.fractionToDecimal(1, 7));
        assertEquals("0.(003)", nb.fractionToDecimal(1, 333));
        assertEquals("-6.25", nb.fractionToDecimal(-50, 8));
        assertEquals("-0.58(3)", nb.fractionToDecimal(7, -12));
    }
}