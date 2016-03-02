package N04;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-29
 */
public class N043_MultiplyStringTest {
    N043_MultiplyString nb = new N043_MultiplyString();

    @Test
    public void testMultiply() throws Exception {
        assertEquals("56088", nb.multiply("123", "456"));
    }
}