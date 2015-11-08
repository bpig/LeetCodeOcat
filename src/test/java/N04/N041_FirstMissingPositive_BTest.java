package N04;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-08
 */
public class N041_FirstMissingPositive_BTest {
    N041_FirstMissingPositive_B nb = new N041_FirstMissingPositive_B();

    @Test
    public void testFirstMissingPositive() throws Exception {
        int[] nums;
        nums = new int[]{1, 2, 0};
        assertEquals(3, nb.firstMissingPositive(nums));

        nums = new int[]{3, 4, -1, 1};
        assertEquals(2, nb.firstMissingPositive(nums));

        nums = new int[]{1, 1};
        assertEquals(2, nb.firstMissingPositive(nums));

        nums = new int[]{1};
        assertEquals(2, nb.firstMissingPositive(nums));

        nums = new int[]{};
        assertEquals(1, nb.firstMissingPositive(nums));
    }
}