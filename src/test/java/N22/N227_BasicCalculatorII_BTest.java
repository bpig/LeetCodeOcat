package N22;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-17
 */
public class N227_BasicCalculatorII_BTest {
    N227_BasicCalculatorII_B nb = new N227_BasicCalculatorII_B();
    @Test
    public void testCalculate() throws Exception {
        // "3+2*2" = 7
        // " 3/2 " = 1
        //" 3+5 / 2 " = 5
        assertEquals(7, nb.calculate("3+2*2"));
        assertEquals(1, nb.calculate("3- 5/ 2"));
    }
}