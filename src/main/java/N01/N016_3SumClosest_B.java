package N01; /**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-12
 */

import java.util.Arrays;

/**
 * Given an array S of n integers,
 * find three integers in S such that the sum is closest to a given number, target.
 * Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 * <p/>
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * <p/>
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class N016_3SumClosest_B {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < nums.length - 2; ++i) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                int close = Math.abs(sum - target);
                if (close < closest) {
                    result = sum;
                    closest = close;
                }
                if (sum > target) {
                    --high;
                } else {
                    ++low;
                }
            }
        }
        return result;
    }
}
