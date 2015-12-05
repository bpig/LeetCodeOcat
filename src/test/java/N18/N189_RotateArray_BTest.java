package N18;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-05
 */
public class N189_RotateArray_BTest {
    N189_RotateArray_B nb = new N189_RotateArray_B();

    @Test
    public void testRotate() throws Exception {
        int[] nums;
        int[] expect;

        nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        expect = new int[]{5, 6, 7, 1, 2, 3, 4};
        nb.rotate(nums, 3);
        assertArrayEquals(expect, nums);

        nums = new int[]{-1};
        expect = new int[]{-1};
        nb.rotate(nums, 2);
        assertArrayEquals(expect, nums);

        nums = new int[]{1, 2, 3};
        expect = new int[]{1, 2, 3};
        nb.rotate(nums, 3);
        assertArrayEquals(expect, nums);

        nums = new int[]{1, 2};
        expect = new int[]{2, 1};
        nb.rotate(nums, 3);
        assertArrayEquals(expect, nums);

    }
}