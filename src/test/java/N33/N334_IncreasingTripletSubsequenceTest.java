package N33;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/4/19
 */
public class N334_IncreasingTripletSubsequenceTest {
    N334_IncreasingTripletSubsequence nb = new N334_IncreasingTripletSubsequence();

    @Test
    public void increasingTriplet() throws Exception {
        int[] nums = new int[]{1, 2, -10, -8, -7};
        assertTrue(nb.increasingTriplet(nums));
    }

}