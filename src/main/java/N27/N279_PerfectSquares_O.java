package N27;

/**
 * Created by wenwen.xww on 2015/10/29.
 */

/*
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.
 */

public class N279_PerfectSquares_O {
    public int numSquares(int n) {
        int[] res = new int[n + 1];
        res[1] = 1;
        for (int i = 2; i < n+1; i++) {
            int min = Integer.MAX_VALUE;
            int j = 1;
            while (j*j <= i) {
                if (j*j == i) {
                    min = 1;
                    break;
                }
                min = Math.min(min,res[i-j*j]+1);
                j++;
            }
            res[i] = min;
        }
        return res[n];
    }
}
