import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-13
 */
public class N015_3Sum_BTest {
    N015_3Sum_B nb = new N015_3Sum_B();

    @Test
    public void testThreeSum() throws Exception {
        int[] num = new int[]{-1, 0, 1};
        List<List<Integer>> result = nb.threeSum(num);
        Integer[] expect = new Integer[]{-1, 0, 1};
        assertEquals(1, result.size());
        assertArrayEquals(expect, result.get(0).toArray(new Integer[3]));
    }
}