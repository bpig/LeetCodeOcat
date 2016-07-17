package N30;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-22
 */

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p/>
 * Design an algorithm to find the maximum profit.
 * You may complete as many transactions as you like
 * (ie, buy one and sell one share of the stock multiple times) with the following restrictions:
 * <p/>
 * You may not engage in multiple transactions at the same time
 * (ie, you must sell the stock before you buy again).
 * After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
 * Example:
 * <p/>
 * prices = [1, 2, 3, 0, 2]
 * maxProfit = 3
 * transactions = [buy, sell, cooldown, buy, sell]
 */
public class N309_BestTimeToBuyAndSellStockWithCooldown_B {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; ++i) {
            int value = prices[i + 1] - prices[i];
            profit += value > 0 ? value : 0;
        }
        for (int i = 1; i < prices.length - 2; ++i) {
            if (prices[i] > prices[i - 1] && prices[i] < prices[i + 1] && prices[i + 1] < prices[i + 2]) {
                int value = prices[i + 2] - prices[i];
                profit -= value > 0 ? value : 0;
            }
        }
        return profit;
    }


    public int maxProfit2(int[] prices) {
        int profit1 = 0, profit2 = 0;
        for (int i = 1; i < prices.length; i++) {
            int copy = profit1;
            profit1 = Math.max(profit1 + prices[i] - prices[i - 1], profit2);
            profit2 = Math.max(copy, profit2);
        }
        return Math.max(profit1, profit2);
    }
}
