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
        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
            return Integer.MAX_VALUE;
        }
        int sign = dividend > 0 ^ divisor > 0 ? -1 : 1;
        int result = 0;
        long m = Math.abs((long) dividend);
        long n = Math.abs((long) divisor);
        while (m >= n) {
            long subN = n;
            for (int subCount = 1; m >= subN; subCount <<= 1, subN <<= 1) {
                m -= subN;
                result += subCount;
            }
        }
        return sign * result;
    }
}