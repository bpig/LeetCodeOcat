package N16;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-05
 */
public class N165_CompareVersionNumbers_BTest {
    N165_CompareVersionNumbers_B nb = new N165_CompareVersionNumbers_B();

    @Test
    public void testCompareVersion() throws Exception {
        assertEquals(1, nb.compareVersion("1", "0"));
        assertEquals(1, nb.compareVersion("1.1", "1"));
        assertEquals(0, nb.compareVersion("01", "1"));
        assertEquals(1, nb.compareVersion("1.0", "1"));
    }
}