package N30;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-20
 */

/**
 * Given an integer array nums,
 * find the sum of the elements between indices i and j (i ≤ j), inclusive.
 * <p/>
 * Example:
 * Given nums = [-2, 0, 3, -5, 2, -1]
 * <p/>
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * Note:
 * You may assume that the array does not change.
 * There are many calls to sumRange function.
 */
public class N303_RangeSumQuery_B {
    int[] sum;

    public N303_RangeSumQuery_B(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; ++i) {
            sum[i + 1] = nums[i] + sum[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }
}
