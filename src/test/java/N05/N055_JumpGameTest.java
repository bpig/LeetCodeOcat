package N05;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */
public class N055_JumpGameTest {
    N055_JumpGame nb = new N055_JumpGame();

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

        nums = new int[]{1, 2, 3};
        assertTrue(nb.canJump(nums));
    }
}