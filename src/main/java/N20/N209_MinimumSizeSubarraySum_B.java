package N20;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-18
 */

/**
 * Given an array of n positive integers and a positive integer s,
 * find the minimal length of a subarray of which the sum >= s.
 * If there isn't one, return 0 instead.
 * <p/>
 * For example, given the array [2,3,1,2,4,3] and s = 7,
 * the subarray [4,3] has the minimal length under the problem constraint.
 * <p/>
 * click to show more practice.
 * <p/>
 * More practice:
 * If you have figured out the O(n) solution,
 * try coding another solution of which the time complexity is O(n log n).
 * <p/>
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 */
public class N209_MinimumSizeSubarraySum_B {
    public int minSubArrayLen(int s, int[] nums) {
        int minlen = Integer.MAX_VALUE;
        int acc = 0;
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            acc += nums[j++];

            while (acc >= s) {
                minlen = Math.min(minlen, j - i);
                acc -= nums[i++];
            }
        }
        return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }
}
