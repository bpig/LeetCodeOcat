package N06;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */

/**
 * Implement int sqrt(int x).
 * <p/>
 * Compute and return the square root of x.
 */
public class N069_sqrtx_B {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        long i = x;
        while (i > x / i) {
            i = (i + x / i) / 2;
        }
        return (int)i;
    }
}
