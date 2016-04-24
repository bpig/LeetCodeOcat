package N33;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/4/24
 */

/**
 * Given a sorted positive integer array nums and an integer n,
 * add/patch elements to the array such that any number in range [1, n]
 * inclusive can be formed by the sum of some elements in the array.
 * Return the minimum number of patches required.
 * <p>
 * Example 1:
 * nums = [1, 3], n = 6
 * Return 1.
 * <p>
 * Combinations of nums are [1], [3], [1,3], which form possible sums of: 1, 3, 4.
 * Now if we add/patch 2 to nums, the combinations are: [1], [2], [3], [1,3], [2,3], [1,2,3].
 * Possible sums are 1, 2, 3, 4, 5, 6, which now covers the range [1, 6].
 * So we only need 1 patch.
 * <p>
 * Example 2:
 * nums = [1, 5, 10], n = 20
 * Return 2.
 * The two patches can be [2, 4].
 * <p>
 * Example 3:
 * nums = [1, 2, 2], n = 5
 * Return 0.
 */
public class N330_PatchingArray_B {
    public int minPatches(int[] nums, int n) {
        int ct = 0;
        long top = 0;
        for (int i = 0; top < n; ) {
            if (i >= nums.length || nums[i] - 1 > top) {
                top += top + 1;
                ct++;
            } else {
                top += nums[i];
                i++;
            }
        }
        return ct;
    }
}
