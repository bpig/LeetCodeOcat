package N08;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/3/27
 */

/**
 * Follow up for "Search in Rotated Sorted Array":
 * What if duplicates are allowed?
 * <p>
 * Would this affect the run-time complexity? How and why?
 * <p>
 * Write a function to determine if a given target is in the array.
 */
public class N081_SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (hi > 0 && nums[hi] == nums[lo]) {
            hi--;
        }
        boolean left = target >= nums[0];
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int value;
            if (nums[mid] >= nums[0] == left) {
                value = nums[mid];
            } else if (nums[mid] >= nums[0]) {
                value = Integer.MIN_VALUE;
            } else {
                value = Integer.MAX_VALUE;
            }
            if (value == target) {
                return true;
            } else if (value > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return false;
    }
}
