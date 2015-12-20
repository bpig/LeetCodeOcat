package N28;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-10-08
 */
public class N287_FindTheDuplicateNumber_BTest {
    N287_FindTheDuplicateNumber_B nb = new N287_FindTheDuplicateNumber_B();

    @Test
    public void testFindDuplicate() throws Exception {
        int[] nums;
        nums = new int[]{2, 1, 3, 2, 4};
        assertEquals(2, nb.findDuplicate(nums));
        assertEquals(2, nb.nlogn(nums));
    }
}