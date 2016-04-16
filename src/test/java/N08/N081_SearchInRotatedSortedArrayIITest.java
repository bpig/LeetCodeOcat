package N08;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/3/27
 */
public class N081_SearchInRotatedSortedArrayIITest {
    N081_SearchInRotatedSortedArrayII nb = new N081_SearchInRotatedSortedArrayII();

    @Test
    public void search() throws Exception {
        assertTrue(nb.search(new int[]{4, 4, 5, 6, 3, 4}, 5));
        assertTrue(nb.search(new int[]{4, 4, 4, 4}, 4));
    }
}