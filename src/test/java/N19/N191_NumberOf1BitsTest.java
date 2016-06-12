package N19;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/6/11
 */
public class N191_NumberOf1BitsTest {
    N191_NumberOf1Bits nb = new N191_NumberOf1Bits();

    @Test
    public void hammingWeight() throws Exception {
        assertEquals(1, nb.hammingWeight(Integer.MAX_VALUE + 1));
    }

}