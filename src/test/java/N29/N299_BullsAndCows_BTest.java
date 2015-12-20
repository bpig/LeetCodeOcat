package N29;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-20
 */
public class N299_BullsAndCows_BTest {
    N299_BullsAndCows_B nb = new N299_BullsAndCows_B();

    @Test
    public void testGetHint() throws Exception {
        assertEquals("1A1B", nb.getHint("1123", "0111"));
        assertEquals("0A0B", nb.getHint("1", "0"));
    }
}