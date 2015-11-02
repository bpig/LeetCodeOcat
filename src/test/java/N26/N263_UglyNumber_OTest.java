package N26;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wenwen.xww on 2015/11/2.
 */
public class N263_UglyNumber_OTest {
    N263_UglyNumber_O example = new N263_UglyNumber_O();
    @Test
    public void testIsUgly() throws Exception {
        assertTrue(example.isUgly(12));
        assertTrue(example.isUgly(6));
        assertTrue(example.isUgly(8));
        assertFalse(example.isUgly(14));
    }
}