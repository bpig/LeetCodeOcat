package N31;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/6/11
 */

/**
 * Given n balloons, indexed from 0 to n-1. Each balloon is painted with a number on it represented by array nums.
 * You are asked to burst all the balloons.
 * If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins.
 * Here left and right are adjacent indices of i. After the burst, the left and right then becomes adjacent.
 * <p>
 * Find the maximum coins you can collect by bursting the balloons wisely.
 * <p>
 * Note:
 * (1) You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not burst them.
 * (2) 0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100
 * <p>
 * Example:
 * <p>
 * Given [3, 1, 5, 8]
 * <p>
 * Return 167
 * <p>
 * nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
 * coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167
 */
public class N312_BurstBalloons_B {
    public int maxCoins(int[] nums) {
        // 1 3 5       3->1->5
        // 1 5 3       3->1->5
        // 5 1 3       1->3->5
        // Extend list with head and tail (both are 1), index starts at 1
        int array[] = new int[nums.length + 2];
        array[0] = 1;
        array[array.length - 1] = 1;
        for (int i = 0; i < nums.length; i++) {
            array[i + 1] = nums[i];
        }

        // Initialize DP arrays, 1 index based
        int dp[][] = new int[array.length][array.length]; //dp[i][j] stands for max coins at i step, burst j

        for (int i = 1; i < array.length - 1; i++) {
            for (int j = i; j >= 1; j--) {
                // k as last
                for (int k = j; k <= i; k++) {
                    dp[j][i] = Math.max(
                            array[j - 1] * array[k] * array[i + 1] + dp[j][k - 1] + dp[k + 1][i],
                            dp[j][i]);
                }
            }
        }

        return dp[1][array.length - 2];
    }
}
