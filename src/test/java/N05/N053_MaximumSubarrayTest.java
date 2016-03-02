package N05;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */
public class N053_MaximumSubarrayTest {
    N053_MaximumSubarray nb = new N053_MaximumSubarray();

    @Test
    public void testMaxSubArray() throws Exception {
        int[] nums;
        nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, nb.maxSubArray(nums));

        nums = new int[]{-2, -3};
        assertEquals(-2, nb.maxSubArray(nums));
    }
}