package N23;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-17
 */

/**
 * Given an integer, write a function to determine if it is a power of two.
 */
public class N231_PowerOfTwo_B {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        n -= n & -n;
        return n == 0;
    }
}
