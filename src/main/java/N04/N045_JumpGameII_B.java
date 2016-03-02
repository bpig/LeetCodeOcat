package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-17
 */

/**
 * Given an array of non-negative integers,
 * you are initially positioned at the first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Your goal is to reach the last index in the minimum number of jumps.
 * <p>
 * For example:
 * Given array A = [2,3,1,1,4]
 * <p>
 * The minimum number of jumps to reach the last index is 2.
 * (Jump 1 step from index 0 to 1, then 3 steps to the last index.)
 */
public class N045_JumpGameII_B {
    public int jump(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        int i = 1;
        int level = 1;
        int curMax = nums[0];
        while (curMax < nums.length - 1) {
            level++;
            int max = Integer.MIN_VALUE;
            for (; i <= curMax; ++i) {
                max = Math.max(max, i + nums[i]);
            }
            curMax = max;
        }
        return level;
    }

    /* timeout in special case*/
    public int scoreC(int[] nums) {
        int[] ret = new int[nums.length];
        for (int i = nums.length - 2; i >= 0; --i) {
            int val = nums[i];
            int dis = nums.length - i - 1;
            if (val >= dis) {
                ret[i] = 1;
            } else {
                int jump = Integer.MAX_VALUE;
                int limit = Math.min(nums.length - 2, i + val);
                for (int j = i + 1; j <= limit; ++j) {
                    jump = Math.min(1 + ret[j], jump);
                }
                ret[i] = jump;
            }
        }
        return ret[0];
    }
}
