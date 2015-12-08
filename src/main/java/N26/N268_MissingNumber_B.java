package N26;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-07
 */

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.
 * <p/>
 * For example,
 * Given nums = [0, 1, 3] return 2.
 * <p/>
 * Note:
 * Your algorithm should run in linear runtime complexity.
 * Could you implement it using only constant extra space complexity?
 * <p/>
 * bitset
 * xor
 * for (int i = 0; i <= nums.length; ++i) {
 * `    ans ^= (i == nums.length) ? i : i ^ nums[i];
 * }
 */
public class N268_MissingNumber_B {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = n * (n + 1) / 2;
        for (int num : nums) {
            ans -= num;
        }
        return ans;
    }
}
