package N02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-28
 */
public class N026_RemoveDuplicatesFromSortedArrayTest {
    N026_RemoveDuplicatesFromSortedArray nb = new N026_RemoveDuplicatesFromSortedArray();

    @Test
    public void testRemoveDuplicates() throws Exception {
        assertEquals(2, nb.removeDuplicates(new int[]{1, 1, 2}));
        assertEquals(1, nb.removeDuplicates(new int[]{1, 1, 1}));
        assertEquals(2, nb.removeDuplicates(new int[]{1, 2}));
    }
}