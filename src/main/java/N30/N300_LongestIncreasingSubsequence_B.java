package N30;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-20
 */

import java.util.Arrays;

/**
 * Given an unsorted array of integers,
 * find the length of longest increasing subsequence.
 * <p/>
 * For example,
 * Given [10, 9, 2, 5, 3, 7, 101, 18],
 * The longest increasing subsequence is [2, 3, 7, 101],
 * therefore the length is 4.
 * Note that there may be more than one LIS combination,
 * it is only necessary for you to return the length.
 * <p/>
 * Your algorithm should run in O(n2) complexity.
 * <p/>
 * Follow up: Could you improve it to O(n log n) time complexity?
 * <p/>
 * https://leetcode.com/discuss/69309/c-o-nlogn-with-explanation-and-references
 */
public class N300_LongestIncreasingSubsequence_B {
    // n2
    public int scoreB(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return n;
        }
        int[] ct = new int[n];
        Arrays.fill(ct, 1);
        int max = 1;
        for (int i = n - 2; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] < nums[j]) {
                    ct[i] = Math.max(ct[i], ct[j] + 1);
                }
            }
            max = Math.max(ct[i], max);
        }
        return max;
    }

    // nlogn
    public int lengthOfLIS(int[] nums) {
        int N = 0, idx, x;
        for (int i = 0; i < nums.length; i++) {
            x = nums[i];
            if (N < 1 || x > nums[N - 1]) {
                nums[N++] = x;
            } else if ((idx = Arrays.binarySearch(nums, 0, N, x)) < 0) {
                nums[-(idx + 1)] = x;
            }
        }
        return N;
    }
}
