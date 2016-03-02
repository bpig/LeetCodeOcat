package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-01
 */

/**
 * Given an array of non-negative integers,
 * you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Your goal is to reach the last index in the minimum number of jumps.
 * <p>
 * For example:
 * Given array A = [2,3,1,1,4]
 * <p>
 * The minimum number of jumps to reach the last index is 2.
 * (Jump 1 step from index 0 to 1, then 3 steps to the last index.)
 */
public class N045_JumpGameII {
    public int jump(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        int pos = 1;
        int step = 1;
        int curMax = nums[0];
        while (curMax < nums.length - 1) {
            step++;
            int max = Integer.MIN_VALUE;
            for (; pos <= curMax; ++pos) {
                max = Math.max(max, pos + nums[pos]);
            }
            curMax = max;
        }
        return step;
    }
}
