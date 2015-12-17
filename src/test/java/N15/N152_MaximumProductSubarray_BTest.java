package N15;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-14
 */
public class N152_MaximumProductSubarray_BTest {
    N152_MaximumProductSubarray_B nb = new N152_MaximumProductSubarray_B();

    @Test
    public void testMaxProduct() throws Exception {
        int[] nums;
        nums = new int[]{2, 3, -2, 4};
        assertEquals(6, nb.maxProduct(nums));


        nums = new int[]{3, -2, 4, -3, 3};
        assertEquals(216, nb.maxProduct(nums));

        nums = new int[]{3, -2, 4};
        assertEquals(4, nb.maxProduct(nums));

        nums = new int[]{3, -2, 4, 0, 2, 3};
        assertEquals(6, nb.maxProduct(nums));

        nums = new int[]{0, -1, 4, -4, 5, -2, -1, -1, -2, -3, 0,
                -3, 0, 1, -1, -4, 4, 6, 2, 3, 0, -5, 2, 1, -4,
                -2, -1, 3, -4, -6, 0, 2, 2, -1, -5, 1, 1, 5, -6,
                2, 1, -3, -6, -6, -3, 4, 0, -2, 0, 2};
        assertEquals(388800, nb.maxProduct(nums));
    }
}