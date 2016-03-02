package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-29
 */

/**
 * Given an unsorted integer array, find the first missing positive integer.
 * <p>
 * For example,
 * Given [1,2,0] return 3,
 * and [3,4,-1,1] return 2.
 * <p>
 * Your algorithm should run in O(n) time and uses constant space.
 */
public class N041_FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] <= 0 || nums[i] > n) {
                i++;
                continue;
            }
            int val = nums[i];
            if (i == val - 1) {
                i++;
                continue;
            }
            nums[i] = nums[val - 1];
            nums[val - 1] = val;
        }
        i = 0;
        while (i < n) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
