package N20;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-18
 */
public class N209_MinimumSizeSubarraySum_BTest {
    N209_MinimumSizeSubarraySum_B nb = new N209_MinimumSizeSubarraySum_B();

    @Test
    public void testMinSubArrayLen() throws Exception {
        int[] nums;
        nums = new int[]{1, 2, 3, 4, 5};
        assertEquals(3, nb.minSubArrayLen(11, nums));
    }
}