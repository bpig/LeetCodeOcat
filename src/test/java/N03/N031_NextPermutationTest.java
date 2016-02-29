package N03;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-29
 */
public class N031_NextPermutationTest {
    N031_NextPermutation nb = new N031_NextPermutation();

    @Test
    public void testNextPermutation() throws Exception {
        int[] nums = new int[]{5, 4, 7, 5, 3, 2};
        int[] expect = new int[]{5, 5, 2, 3, 4, 7};
        nb.nextPermutation(nums);
        assertArrayEquals(expect, nums);
    }
}