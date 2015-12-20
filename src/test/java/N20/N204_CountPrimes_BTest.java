package N20;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-19
 */
public class N204_CountPrimes_BTest {
    N204_CountPrimes_B nb = new N204_CountPrimes_B();

    @Test
    public void testCountPrimes() throws Exception {
        assertEquals(0, nb.countPrimes(2));
        assertEquals(1, nb.countPrimes(3));
        assertEquals(3, nb.countPrimes(7));
    }
}