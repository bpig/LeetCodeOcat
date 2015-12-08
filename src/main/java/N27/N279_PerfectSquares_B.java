package N27;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-10-29
 */

import java.util.Arrays;

/**
 * Given a positive integer n,
 * find the least number of perfect square numbers
 * (for example, 1, 4, 9, 16, ...) which sum to n.
 * <p/>
 * For example, given n = 12,
 * return 3 because 12 = 4 + 4 + 4;
 * given n = 13, return 2 because 13 = 4 + 9.
 */
public class N279_PerfectSquares_B {
    // why so slow in java?
    public int seemScoreA(int n) {
        int[] record = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            record[i] = i;
            int m = (int) Math.floor(Math.sqrt(i));
            for (int j = 1; j <= m; j++) {
                int ct = i / (j * j);
                if (record[i - j * j * ct] + ct < record[i]) {
                    record[i] = record[i - j * j * ct] + ct;
                }
            }
        }
        return record[n];
    }

    public int numSquares(int n) {
        int[] cache = new int[n + 1];
        Arrays.fill(cache, -1);
        wrap(n, cache);
        return cache[n];
    }

    public int wrap(int n, int[] cache) {
        if (cache[n] != -1) {
            return cache[n];
        }
        int ret = recur(n, cache);
        cache[n] = ret;
        return ret;
    }

    public int recur(int n, int[] cache) {
        if (n == 0) {
            return 0;
        }

        int m = (int) Math.floor(Math.sqrt(n));
        int min = Integer.MAX_VALUE;
        for (int i = m; i >= 1; --i) {
            int ct = n / (i * i);
            int ret = wrap(n - i * i * ct, cache) + ct;
            if (ret < min) {
                min = ret;
            }
        }
        return min;
    }
}
