package N30;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-28
 */
public class N309_BestTimeToBuyAndSellStockWithCooldown_BTest {
    N309_BestTimeToBuyAndSellStockWithCooldown_B nb = new N309_BestTimeToBuyAndSellStockWithCooldown_B();

    @Test
    public void testMaxProfit() throws Exception {
        assertEquals(3, nb.maxProfit(new int[]{1, 2, 3, 0, 2}));
    }
}