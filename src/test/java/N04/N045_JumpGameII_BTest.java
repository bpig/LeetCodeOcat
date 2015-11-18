package N04;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-17
 */
public class N045_JumpGameII_BTest {
    N045_JumpGameII_B nb = new N045_JumpGameII_B();

    @Test
    public void testJump() throws Exception {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        assertEquals(2, nb.jump(nums));
    }
}