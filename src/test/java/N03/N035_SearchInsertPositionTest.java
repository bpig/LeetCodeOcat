package N03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-27
 */
public class N035_SearchInsertPositionTest {
    N035_SearchInsertPosition nb = new N035_SearchInsertPosition();

    @Test
    public void testSearchInsert() throws Exception {
        int[] nums = new int[]{1, 3, 5, 6};
        assertEquals(2, nb.searchInsert(nums, 5));
        assertEquals(1, nb.searchInsert(nums, 2));
        assertEquals(4, nb.searchInsert(nums, 7));
        assertEquals(0, nb.searchInsert(nums, 0));
    }
}