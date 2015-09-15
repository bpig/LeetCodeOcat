package N01;

import N01.N016_3SumClosest_B;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-13
 */
public class N016_3SumClosest_BTest {
    N016_3SumClosest_B nb = new N016_3SumClosest_B();

    @Test
    public void testThreeSumClosest() throws Exception {
        assertEquals(2, nb.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
}