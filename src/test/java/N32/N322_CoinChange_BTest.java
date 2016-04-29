package N32;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/4/29
 */
public class N322_CoinChange_BTest {
    N322_CoinChange_B nb = new N322_CoinChange_B();

    @Test
    public void coinChange() throws Exception {
        assertEquals(3, nb.coinChange(new int[]{1, 2, 5}, 11));
        assertEquals(-1, nb.coinChange(new int[]{2}, 3));
        assertEquals(20, nb.coinChange(new int[]{186, 419, 83, 408}, 6249));
    }

}