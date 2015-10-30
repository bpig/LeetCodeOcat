package N27;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wenwen.xww on 2015/10/30.
 */
public class N275_HIndex2_OTest {
    N275_HIndex2_O example = new N275_HIndex2_O();
    @Test
    public void testHIndex() throws Exception {
        int[] ci = {0, 1, 2, 5, 6};
        assertEquals(2, example.hIndex(ci));
    }
}