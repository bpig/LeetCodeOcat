package N23;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-09
 */
public class N238_ProductOfArrayExceptSelf_BTest {
    N238_ProductOfArrayExceptSelf_B nb = new N238_ProductOfArrayExceptSelf_B();

    @Test
    public void testProductExceptSelf() throws Exception {
        int[] nums;
        int[] expects;
        nums = new int[]{1, 2, 4, 8};
        expects = new int[]{64, 32, 16, 8};
        assertArrayEquals(expects, nb.productExceptSelf(nums));
    }
}