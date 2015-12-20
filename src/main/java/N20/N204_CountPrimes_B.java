package N20;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-19
 */

/**
 * Count the number of prime numbers less than a non-negative number, n.
 */
public class N204_CountPrimes_B {
    public int countPrimes(int n) {
        boolean[] m = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (m[i]) {
                continue;
            }
            count++;
            for (int j = i; j < n; j = j + i) {
                m[j] = true;
            }
        }
        return count;
    }
}
