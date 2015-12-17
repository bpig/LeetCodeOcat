package N17;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-14
 */
public class N179_LargestNumber_BTest {
    N179_LargestNumber_B nb = new N179_LargestNumber_B();

    @Test
    public void testLargestNumber() throws Exception {
        int[] nums;
        nums = new int[]{30, 3, 34};
        assertEquals("34330", nb.largestNumber(nums));

        nums = new int[]{3, 30, 34, 5, 9};
        assertEquals("9534330", nb.largestNumber(nums));
    }
}