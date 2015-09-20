package N02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-20
 */
public class N026_RemoveDuplicatesFromSortedArray_BTest {
    N026_RemoveDuplicatesFromSortedArray_B nb = new N026_RemoveDuplicatesFromSortedArray_B();

    @Test
    public void testRemoveDuplicates() throws Exception {
        int value = nb.removeDuplicates(new int[]{1, 1, 2, 3, 3});
        //int[] expect = new int[]{1, 2, 3};
        assertEquals(3, value);
    }
}