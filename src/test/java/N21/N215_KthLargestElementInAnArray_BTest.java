package N21;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-19
 */
public class N215_KthLargestElementInAnArray_BTest {
    N215_KthLargestElementInAnArray_B nb = new N215_KthLargestElementInAnArray_B();

    @Test
    public void testFindKthLargest() throws Exception {
        int[] nums;
        nums = new int[]{3, 2, 1, 5, 6, 4};
        assertEquals(5, nb.findKthLargest(nums, 2));
    }
}