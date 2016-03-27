package N06;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-05
 */
public class N065_ValidNumberTest {
    N065_ValidNumber nb = new N065_ValidNumber();

    @Test
    public void testIsNumber() throws Exception {
        assertTrue(nb.isNumber("01"));
        assertTrue(nb.isNumber("0e1"));
        assertTrue(nb.isNumber(".2"));
        assertFalse(nb.isNumber("1ec3"));
        assertFalse(nb.isNumber("."));
        assertFalse(nb.isNumber(" "));
        assertFalse(nb.isNumber("0e"));
        assertTrue(nb.isNumber("2."));
        assertTrue(nb.isNumber("-2."));
        assertFalse(nb.isNumber(" -."));
    }
}