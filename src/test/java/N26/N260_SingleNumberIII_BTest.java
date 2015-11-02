package N26;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-02
 */
public class N260_SingleNumberIII_BTest {
    N260_SingleNumberIII_B nb = new N260_SingleNumberIII_B();
    @Test
    public void testGetNotZero() throws Exception {
        assertEquals(0, nb.getNotZero(1));
        assertEquals(2, nb.getNotZero(4));
    }

    @Test
    public void testSingleNumber() throws Exception {
        assertArrayEquals(new int[] {3, 4}, nb.singleNumber(
                new int[] {1, 1, 2, 2, 3, 4, 5, 5}
        ));
    }
}