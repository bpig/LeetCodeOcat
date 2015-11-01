package N26;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wenwen.xww on 2015/11/1.
 */
public class N263_UglyNumberTest {
    N263_UglyNumber example = new N263_UglyNumber();
    @Test
    public void testIsUgly() throws Exception {
        assertTrue(example.isUgly(12));
        assertTrue(example.isUgly(6));
        assertTrue(example.isUgly(8));
        assertFalse(example.isUgly(14));
    }
}