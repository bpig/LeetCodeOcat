import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-08
 * Time: 09:30
 */
public class N001_TwoSum_BTest {
    private N001_TwoSum_B nb = new N001_TwoSum_B();
    @Test
    public void test() {
        int[] nums = new int[] {1,2,3};
        int[] values = nb.twoSum(nums, 4);
        int[] expect = new int[] {1,3};
        assertArrayEquals(expect, values);
    }
}