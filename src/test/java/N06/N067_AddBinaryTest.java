package N06;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-05
 */
public class N067_AddBinaryTest {
    N067_AddBinary nb = new N067_AddBinary();

    @Test
    public void testAddBinary() throws Exception {
        assertEquals("100", nb.addBinary("1", "11"));
        assertEquals("11", nb.addBinary("1", "10"));
    }
}