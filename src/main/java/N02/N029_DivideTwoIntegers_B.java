package N02;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-17
 */

/**
 * Divide two integers without using multiplication,
 * division and mod operator.
 * <p/>
 * If it is overflow, return MAX_INT.
 */
public class N029_DivideTwoIntegers_B {
    public int divide(int dividend, int divisor) {
        //todo
        if (divisor > dividend) {
            return 0;
        }
        int ct = 0;
        int v = 0;
        while (dividend >= divisor) {
            divisor <<= 1;
            v += 1;
        }
        ct += 1 << v;
        dividend -= divisor;
        while (v > 0) {
            v--;
            divisor >>= 1;
            if (dividend >= divisor) {
                dividend -= divisor;
                ct += v;
            }
        }
        return ct;
    }
}
