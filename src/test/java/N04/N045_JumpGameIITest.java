package N04;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-01
 */
public class N045_JumpGameIITest {
    N045_JumpGameII nb = new N045_JumpGameII();

    @Test
    public void testJump() throws Exception {
        int[] nums;
        nums = new int[]{2, 3, 1, 1, 4};
        assertEquals(2, nb.jump(nums));

        nums = new int[]{2, 3, 1};
        assertEquals(1, nb.jump(nums));

        nums = new int[]{7, 0, 9, 6, 9, 6, 1, 7, 9, 0, 1, 2, 9, 0, 3};
        assertEquals(2, nb.jump(nums));

        nums = new int[]{0};
        assertEquals(0, nb.jump(nums));
    }

}