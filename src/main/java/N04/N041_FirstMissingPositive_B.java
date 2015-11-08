package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-27
 */

/**
 * Given an unsorted integer array, find the first missing positive integer.
 * <p/>
 * For example,
 * Given [1,2,0] return 3,
 * and [3,4,-1,1] return 2.
 * <p/>
 * Your algorithm should run in O(n) time and uses constant space.
 */
public class N041_FirstMissingPositive_B {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] <= 0 || nums[i] > n) {
                ++i;
                continue;
            }
            int val = nums[i];
            int idx = val - 1;
            if (nums[idx] == val) {
                ++i;
                continue;
            }
            nums[i] = nums[idx];
            nums[idx] = val;
        }
        i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
            ++i;
        }
        return n + 1;
    }
}
