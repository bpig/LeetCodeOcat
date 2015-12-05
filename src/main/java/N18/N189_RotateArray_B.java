package N18;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-05
 */

/**
 * Rotate an array of n elements to the right by k steps.
 * <p/>
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * <p/>
 * Note:
 * Try to come up as many solutions as you can,
 * there are at least 3 different ways to solve this problem.
 * Hint:
 * Could you do it in-place with O(1) extra space?
 * <p/>
 * https://leetcode.com/discuss/30527/three-way-solve-this-problem-the-first-way-interesting-java
 */

public class N189_RotateArray_B {
    public void swap(int[] nums, int lo, int hi) {
        for (; lo < hi; lo++, hi--) {
            int tmp = nums[lo];
            nums[lo] = nums[hi];
            nums[hi] = tmp;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        swap(nums, 0, nums.length - k - 1);
        swap(nums, nums.length - k, nums.length - 1);
        swap(nums, 0, nums.length - 1);
    }
}
