package N27;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-07
 */
public class N278_FirstBadVersion_BTest {
    N278_FirstBadVersion_B nb = new N278_FirstBadVersion_B();

    @Test
    public void testFirstBadVersion() throws Exception {
        nb.setData(new boolean[]{false, false, true, true, true, true});
        assertEquals(3, nb.firstBadVersion(6));
    }
}