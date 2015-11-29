package N05;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-29
 */
public class N053_MaximumSubarray_BTest {
    N053_MaximumSubarray_B nb = new N053_MaximumSubarray_B();

    @Test
    public void testMaxSubArray() throws Exception {
        int[] nums;
        nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, nb.maxSubArray(nums));

        nums = new int[]{-2};
        assertEquals(-2, nb.maxSubArray(nums));
    }
}