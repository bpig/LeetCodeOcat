package N05;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-29
 */

/**
 * Given an array of non-negative integers,
 * you are initially positioned at the first index of the array.
 * <p/>
 * Each element in the array represents your maximum jump length at that position.
 * <p/>
 * Determine if you are able to reach the last index.
 * <p/>
 * For example:
 * A = [2,3,1,1,4], return true.
 * <p/>
 * A = [3,2,1,0,4], return false.
 */
public class N055_JumpGame_B {
    public boolean canJump(int[] nums) {
        int target = nums.length - 1;
        for (int i = target - 1; i >= 0; i--) {
            if (nums[i] + i >= target) {
                target = i;
            }
        }
        return target == 0;
    }

    public boolean scoreB(int[] nums) {
        int end = nums[0];
        int idx = 1;
        while (idx <= end) {
            if (end >= nums.length - 1) {
                return true;
            }
            end = Math.max(nums[idx] + idx, end);
            ++idx;
        }
        return end >= nums.length - 1;
    }
}
