package N12;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-22
 */
public class N123_BestTimeToBuyAndSellStockIII_BTest {
    N123_BestTimeToBuyAndSellStockIII_B nb = new N123_BestTimeToBuyAndSellStockIII_B();

    @Test
    public void testMaxProfit() throws Exception {
        int[] nums;
        nums = new int[]{1, 2};
        assertEquals(1, nb.maxProfit(nums));

        nums = new int[]{2, 1, 2, 0, 1};
        assertEquals(2, nb.maxProfit(nums));
    }
}