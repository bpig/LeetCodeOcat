package N30;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-20
 */
public class N300_LongestIncreasingSubsequence_BTest {
    N300_LongestIncreasingSubsequence_B nb = new N300_LongestIncreasingSubsequence_B();

    @Test
    public void testLengthOfLIS() throws Exception {
        int[] nums;
        nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, nb.lengthOfLIS(nums));

        nums = new int[]{10, 9, 2, 5, 3, 4};
        assertEquals(3, nb.lengthOfLIS(nums));

        nums = new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6};
        assertEquals(6, nb.lengthOfLIS(nums));
    }
}