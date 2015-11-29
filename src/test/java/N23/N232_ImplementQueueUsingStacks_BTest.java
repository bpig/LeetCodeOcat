package N23;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-29
 */
public class N232_ImplementQueueUsingStacks_BTest {
    N232_ImplementQueueUsingStacks_B nb = new N232_ImplementQueueUsingStacks_B();
    @Test
    public void testPeek() throws Exception {
        nb.push(1);
        nb.push(2);
        assertEquals(1, nb.peek());
    }
}