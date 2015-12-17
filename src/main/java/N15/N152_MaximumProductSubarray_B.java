package N15;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-14
 */

/**
 * Find the contiguous subarray within an array
 * (containing at least one number) which has the largest product.
 * <p/>
 * For example, given the array [2,3,-2,4],
 * the contiguous subarray [2,3] has the largest product = 6.
 */
public class N152_MaximumProductSubarray_B {
    public int scoreB(int[] nums) {
        return recur(nums, 0);
    }

    int recur(int[] nums, int start) {
        if (start == nums.length) {
            return 1;
        }
        int ans = Integer.MIN_VALUE;
        int product = 1;
        for (int i = start; i < nums.length; ++i) {
            int num = nums[i];
            product *= num;
            ans = Math.max(ans, product);
            if (num < 0) {
                ans = Math.max(ans, recur(nums, i + 1));
            }
            if (num == 0) {
                return Math.max(ans, recur(nums, i + 1));
            }
        }
        return ans;
    }

    public int maxProduct(int[] nums) {
        // positive product ending at i - 1, with max abs value
        int maxPosProd = 1;
        // negative product ending at i - 1, with max abs value
        int maxNegProd = 1;
        int globalMax = Integer.MIN_VALUE;
        for (int n : nums) {
            int max = n;
            if (n < 0) {
                max *= maxNegProd;
                maxNegProd = maxPosProd * n;
                maxPosProd = max > 0 ? max : 1;
            } else if (n > 0) {
                max *= maxPosProd;
                maxPosProd = max;
                maxNegProd = maxNegProd < 0 ? maxNegProd * n : 1;
            } else {
                // nums[i] == 0, reset
                maxPosProd = 1;
                maxNegProd = 1;
            }
            globalMax = Math.max(globalMax, max);
        }
        return globalMax;
    }
}
