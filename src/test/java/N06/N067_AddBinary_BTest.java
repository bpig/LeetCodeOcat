package N06;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-05
 */
public class N067_AddBinary_BTest {
    N067_AddBinary_B nb = new N067_AddBinary_B();
    @Test
    public void testAddBinary() throws Exception {
        assertEquals("100", nb.addBinary("11", "1"));
        assertEquals("110", nb.addBinary("101", "1"));
        assertEquals("10", nb.addBinary("1", "1"));
        assertEquals("1", nb.addBinary("0", "1"));
    }
}