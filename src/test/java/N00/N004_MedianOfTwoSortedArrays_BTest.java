package N00;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-08
 */
public class N004_MedianOfTwoSortedArrays_BTest {
    N004_MedianOfTwoSortedArrays_B nb = new N004_MedianOfTwoSortedArrays_B();

    @Test
    public void test() {
        int[] a;
        int[] b;

//        a = new int[0];
//        b = new int[]{1};
//        assertEquals(1.0, nb.findMedianSortedArrays(a, b), 0.001);

        a = new int[]{2, 3, 4};
        b = new int[]{1};
        assertEquals(2.5, nb.findMedianSortedArrays(a, b), 0.001);
    }
}