package N27;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wenwen.xww on 2015/10/30.
 */
public class N274_HIndex_OTest {
    N274_HIndex_O example = new N274_HIndex_O();
    @Test
    public void testHIndex() throws Exception {
        int[] ci = {3, 0, 6, 1, 5};
        assertEquals(3, example.hIndex(ci));
    }
}