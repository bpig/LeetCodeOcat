package N03;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-27
 */

/**
 * Given a sorted array of integers, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 * <p/>
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 */
public class N034_SearchForARange_B {
    int searchLeft(int[] nums, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        }
        int mid = begin + (end - begin) / 2;
        if (nums[mid] == target) {
            int left = searchLeft(nums, begin, mid - 1, target);
            return left == -1 ? mid : left;
        } else if (nums[mid] < target) {
            return searchLeft(nums, mid + 1, end, target);
        } else {
            return searchLeft(nums, begin, mid - 1, target);
        }
    }

    int searchRight(int[] nums, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        }
        int mid = begin + (end - begin) / 2;
        if (nums[mid] == target) {
            int right = searchRight(nums, mid + 1, end, target);
            return right == -1 ? mid : right;
        } else if (nums[mid] < target) {
            return searchRight(nums, mid + 1, end, target);
        } else {
            return searchRight(nums, begin, mid - 1, target);
        }

    }

    public int[] score1(int[] nums, int target) {
        int left = searchLeft(nums, 0, nums.length - 1, target);
        int right = searchRight(nums, 0, nums.length - 1, target);
        return new int[] {left, right};
    }

    public int[] searchRange(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        int[] ret = new int[] {-1, -1};
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        if (nums[lo] != target) {
            return ret;
        }
        ret[0] = lo;
        lo = 0;
        hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo + 1) / 2;
            if (nums[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid;
            }
        }
        ret[1] = lo;
        return ret;
    }
}
