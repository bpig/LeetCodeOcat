package N31;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/6/12
 */
public class N312_BurstBalloons_BTest {
    N312_BurstBalloons_B nb = new N312_BurstBalloons_B();

    @Test
    public void maxCoins() throws Exception {
        int[] nums;
        nums = new int[]{3, 1, 5, 8};
        assertEquals(167, nb.maxCoins(nums));
    }

}