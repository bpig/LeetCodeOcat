package N05;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-22
 */

/**
 * Implement pow(x, n).
 */
public class N050_PowXN_B {
    public double myPow(double x, int n) {
        boolean sign = n >= 0;
        n = sign ? n : -n;
        double ret = 1;
        while (n > 0) {
            double v = x;
            int value = 1;
            while (n >= value) {
                ret *= v;
                n -= value;
                value *= 2;
                v *= v;
            }
        }
        return sign ? ret : 1 / ret;
    }
}
