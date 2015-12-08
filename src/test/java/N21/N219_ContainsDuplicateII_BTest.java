package N21;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-08
 */
public class N219_ContainsDuplicateII_BTest {
    N219_ContainsDuplicateII_B nb = new N219_ContainsDuplicateII_B();

    @Test
    public void testContainsNearbyDuplicate() throws Exception {
        int[] nums;
        nums = new int[]{1, 0, 1, 1};
        assertTrue(nb.containsNearbyDuplicate(nums, 1));

        nums = new int[]{1, 2, 3, 1, 2, 3};
        assertFalse(nb.containsNearbyDuplicate(nums, 2));

        nums = new int[]{-1, -1};
        assertTrue(nb.containsNearbyDuplicate(nums, 1));
    }
}