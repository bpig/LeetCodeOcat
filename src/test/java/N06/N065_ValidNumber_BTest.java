package N06;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */
public class N065_ValidNumber_BTest {
    N065_ValidNumber_B nb = new N065_ValidNumber_B();
    @Test
    public void testIsValid() throws Exception {
        assertTrue(nb.isNumber("01"));
        assertFalse(nb.isNumber("1ec3"));
    }
}