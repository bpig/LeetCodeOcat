package N03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-27
 */
public class N038_CountAndSayTest {
    N038_CountAndSay nb = new N038_CountAndSay();
    @Test
    public void testTransform() throws Exception {
        assertEquals("111221", nb.countAndSay(5));
    }
}