package N12;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-22
 */

/**
 * Say you have an array for which the ith element
 * is the price of a given stock on day i.
 * <p/>
 * If you were only permitted to complete at most one transaction
 * (ie, buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 */
public class N121_BestTimeToBuyAndSellStock_B {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int profit = 0;
        int low = prices[0];
        for (int i = 1; i < prices.length; ++i) {
            profit = Math.max(prices[i] - low, profit);
            low = Math.min(prices[i], low);
        }
        return profit;
    }
}
