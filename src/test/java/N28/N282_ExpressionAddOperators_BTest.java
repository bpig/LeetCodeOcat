package N28;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-07
 */
public class N282_ExpressionAddOperators_BTest {
    N282_ExpressionAddOperators_B nb = new N282_ExpressionAddOperators_B();

    @Test
    /**
     * * "123", 6 -> ["1+2+3", "1*2*3"]
     * "232", 8 -> ["2*3+2", "2+3*2"]
     * "105", 5 -> ["1*0+5","10-5"]
     * "00", 0 -> ["0+0", "0-0", "0*0"]
     * "3456237490", 9191 -> []
     */
    public void testAddOperators() throws Exception {
        List<String> expect;

        expect = Arrays.asList("1+2+3", "1*2*3");
        assertEquals(expect, nb.addOperators("123", 6));


        expect = Arrays.asList( "2+3*2","2*3+2");
        assertEquals(expect, nb.addOperators("232", 8));

        expect = Arrays.asList("1*0+5", "10-5");
        assertEquals(expect, nb.addOperators("105", 5));

        expect = Arrays.asList("0+0", "0-0", "0*0");
        assertEquals(expect, nb.addOperators("00", 0));

        expect = Arrays.asList();
        assertEquals(expect, nb.addOperators("3456237490", 9191));
    }
}