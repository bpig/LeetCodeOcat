package N23;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-09
 */

/**
 * Given an array of n integers where n > 1, nums,
 * return an array output such that output[i] is equal to
 * the product of all the elements of nums except nums[i].
 * <p/>
 * Solve it without division and in O(n).
 * <p/>
 * For example, given [1,2,3,4], return [24,12,8,6].
 * <p/>
 * Follow up:
 * Could you solve it with constant space complexity?
 * (Note: The output array does not count as extra space
 * for the purpose of space complexity analysis.)
 */
public class N238_ProductOfArrayExceptSelf_B {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int cur = 1;
        for (int i = 0; i < nums.length; ++i) {
            res[i] = cur;
            cur *= nums[i];
        }
        cur = 1;
        for (int i = nums.length - 1; i >= 0; --i) {
            res[i] *= cur;
            cur *= nums[i];
        }
        return res;
    }
}
