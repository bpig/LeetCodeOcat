package N12;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-22
 */

/**
 * Say you have an array for which the ith element
 * is the price of a given stock on day i.
 * <p/>
 * Design an algorithm to find the maximum profit.
 * You may complete at most two transactions.
 * <p/>
 * Note:
 * You may not engage in multiple transactions at the same time
 * (ie, you must sell the stock before you buy again).
 */
public class N123_BestTimeToBuyAndSellStockIII_B {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n <= 1) {
            return 0;
        }
        int[] left = new int[n];
        int min = prices[0];
        for (int i = 1; i < n; ++i) {
            left[i] = Math.max(prices[i] - min, left[i - 1]);
            min = Math.min(prices[i], min);
        }
        int[] right = new int[n];
        int max = prices[n - 1];
        int profit = 0;
        for (int i = n - 2; i >= 0; --i) {
            right[i] = Math.max(max - prices[i], right[i + 1]);
            max = Math.max(prices[i], max);
            profit = Math.max(left[i] + right[i], profit);
        }
        return profit;
    }
}
