package N05;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */

/**
 * Implement pow(x, n).
 */
public class N050_PowXN {
    public double myPow(double x, int n) {
        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                return 1 / myPow(x, -(n + 1)) / x;
            }
            return 1 / myPow(x, -n);
        }
        double ans = 1;
        while (n > 0) {
            double y = x;
            for (int i = 1; i <= n; i *= 2) {
                n -= i;
                ans *= y;
                y = y * y;
            }
        }
        return ans;
    }
}
