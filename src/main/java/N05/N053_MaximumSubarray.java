package N05;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */

/**
 * Find the contiguous subarray within an array
 * (containing at least one number)
 * which has the largest sum.
 * <p>
 * For example, given the array [−2, 1, −3, 4, −1, 2, 1, −5, 4],
 * the contiguous subarray [4, −1, 2, 1] has the largest sum = 6
 */

public class N053_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum = Math.max(num + sum, num);
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
