package N05;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */

/**
 * Given an array of non-negative integers,
 * you are initially positioned at the first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * Determine if you are able to reach the last index.
 * <p>
 * For example:
 * A = [2,3,1,1,4], return true.
 * A = [3,2,1,0,4], return false.
 */

public class N055_JumpGame {
    public boolean canJump(int[] nums) {
        int target = nums.length - 1;
        for (int i = target - 1; i >= 0; i--) {
            if (i + nums[i] >= target) {
                target = i;
            }
        }
        return target == 0;
    }

}
