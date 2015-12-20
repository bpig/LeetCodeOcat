package N26;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-19
 */
public class N263_UglyNumber_BTest {
    N263_UglyNumber_B nb = new N263_UglyNumber_B();
    @Test
    public void testIsUgly() throws Exception {
        assertTrue(nb.isUgly(2));
    }
}