package N02;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-20
 */

/**
 * Given a sorted array,
 * remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p/>
 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 2,
 * with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
  */
public class N026_RemoveDuplicatesFromSortedArray_B {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int idx = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != nums[i-1]) {
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
}
