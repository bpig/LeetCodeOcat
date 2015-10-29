package N27;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-10-29
 */
public class N279_PerfectSquares_B {
    public int numSquares(int n) {
        if (n == 0) { return 0; }

        int m = (int) Math.floor(Math.sqrt(n));
        if (m * m == n) { return 1; }
        if (m == 1) { return n; }

        int min = Integer.MAX_VALUE;
        for (int i = m; i >= 1; --i) {
            int ct = n / (i * i);
            int ret = numSquares(n - i * i * ct) + ct;
            if (ret < min) {
                min = ret;
            }
        }
        return min;
    }
}
