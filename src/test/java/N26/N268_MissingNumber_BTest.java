package N26;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-07
 */
public class N268_MissingNumber_BTest {
    N268_MissingNumber_B nb = new N268_MissingNumber_B();

    @Test
    public void testMissingNumber() throws Exception {
        int[] nums;
        nums = new int[]{0, 1, 3};
        assertEquals(2, nb.missingNumber(nums));
    }
}