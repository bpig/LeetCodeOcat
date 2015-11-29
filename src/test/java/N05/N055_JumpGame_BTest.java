package N05;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-29
 */
public class N055_JumpGame_BTest {
    N055_JumpGame_B nb = new N055_JumpGame_B();

    @Test
    public void testCanJump() throws Exception {
        int[] nums;
        nums = new int[]{2, 3, 1, 1, 4};
        assertTrue(nb.canJump(nums));

        nums = new int[]{0};
        assertTrue(nb.canJump(nums));

        nums = new int[]{1};
        assertTrue(nb.canJump(nums));

        nums = new int[]{0, 1};
        assertFalse(nb.canJump(nums));
    }
}