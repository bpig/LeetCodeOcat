package N03;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-27
 */

/**
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * <p/>
 * You are given a target value to search.
 * If found in the array return its index, otherwise return -1.
 * <p/>
 * You may assume no duplicate exists in the array.
 */
public class N033_SearchInRotatedSortedArray_B {
    int recur(int[] nums, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        }
        int mid = begin + (end - begin) / 2;
        int midValue = nums[mid];
        if (midValue == target) {
            return mid;
        }
        if (midValue > nums[begin]) {
            if (target > midValue) {
                return recur(nums, mid + 1, end, target);
            } else {
                return recur(nums, begin, mid - 1, target);
            }
        } else {
            if (target < midValue) {
                return recur(nums, begin, mid - 1, target);
            } else {
                return recur(nums, mid + 1, end, target);
            }
        }
    }

    public int search(int[] nums, int target) {
        return recur(nums, 0, nums.length - 1, target);
    }
}
