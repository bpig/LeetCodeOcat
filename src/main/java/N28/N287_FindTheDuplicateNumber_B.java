package N28;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-10-08
 */

/**
 * Given an array nums containing n + 1 integers
 * where each integer is between 1 and n (inclusive),
 * prove that at least one duplicate number must exist.
 * Assume that there is only one duplicate number, find the duplicate one.
 * <p/>
 * Note:
 * You must not modify the array (assume the array is read only).
 * You must use only constant, O(1) extra space.
 * Your runtime complexity should be less than O(n2).
 * There is only one duplicate number in the array,
 * but it could be repeated more than once.
 */
public class N287_FindTheDuplicateNumber_B {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        int finder = 0;

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) {
                break;
            }
        }

        while (true) {
            slow = nums[slow];
            finder = nums[finder];
            if (slow == finder) {
                return slow;
            }
        }
    }

    int nlogn(int[] nums) {
        int n = nums.length - 1;
        int low = 1;
        int high = n;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            int count = 0;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }
            if (count > mid) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
