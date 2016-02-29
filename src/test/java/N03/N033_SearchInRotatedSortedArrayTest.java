package N03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-29
 */
public class N033_SearchInRotatedSortedArrayTest {
    N033_SearchInRotatedSortedArray nb = new N033_SearchInRotatedSortedArray();

    @Test
    public void testSearch() throws Exception {
        assertEquals(1, nb.search(new int[]{3, 1}, 1));
        assertEquals(0, nb.search(new int[]{3, 1}, 3));
        assertEquals(0, nb.search(new int[]{1, 3}, 1));
        assertEquals(1, nb.search(new int[]{1, 3}, 3));
        assertEquals(0, nb.search(new int[]{4, 5, 6, 7, 1, 2, 3}, 4));
        assertEquals(-1, nb.search(new int[]{4, 5, 6, 7, 1, 2, 3}, 0));
        assertEquals(3, nb.search(new int[]{4, 5, 6, 7, 1, 2, 3}, 7));
    }
}