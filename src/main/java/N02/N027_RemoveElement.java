package N02;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-28
 */

/**
 * Given an array and a value,
 * remove all instances of that value in place and return the new length.
 * <p/>
 * The order of elements can be changed.
 * It doesn't matter what you leave beyond the new length.
 */
public class N027_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
