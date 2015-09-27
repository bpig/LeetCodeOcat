package N03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-27
 */
public class N033_SearchInRotatedSortedArray_BTest {
    N033_SearchInRotatedSortedArray_B nb = new N033_SearchInRotatedSortedArray_B();

    @Test
    public void testSearch() throws Exception {
        assertEquals(0, nb.search(new int[]{4, 5, 6, 7, 1, 2, 3}, 4));
        assertEquals(-1, nb.search(new int[]{4, 5, 6, 7, 1, 2, 3}, 0));
        assertEquals(3, nb.search(new int[]{4, 5, 6, 7, 1, 2, 3}, 7));
        assertEquals(1, nb.search(new int[]{3, 1}, 1));
    }
}