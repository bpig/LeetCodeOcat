package N04;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-17
 */
public class N042_TrappingRainWater_BTest {
    N042_TrappingRainWater_B nb = new N042_TrappingRainWater_B();

    @Test
    public void testTrap() throws Exception {
        int[] num = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, nb.trap(num));
    }
}