package N16;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-22
 */
public class N164_MaximumGap_BTest {
    N164_MaximumGap_B nb = new N164_MaximumGap_B();

    @Test
    public void testMaximumGap() throws Exception {
        int[] nums;
        nums = new int[]{6, 7, 13, 12, 14};
        assertEquals(2, nb.maximumGap(nums));
    }
}