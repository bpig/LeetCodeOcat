package N36;

/**
 * Created by shuai.li on 7/17/16.
 */

/**
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 * <p>
 * Note: Do not use any built-in library function such as sqrt.
 * <p>
 * Example 1:
 * Input: 16
 * Returns: True
 * <p>
 * Example 2:
 * Input: 14
 * Returns: False
 */

public class N367_ValidPerfectSquare_B {
    int sqrt(int num) {
        if (num <= 0) {
            return 0;
        }
        long i = num;
        while (i > num / i) {
            i = (i + num / i) / 2;
        }
        return (int) i;
    }

    public boolean isPerfectSquare(int num) {
        int n = sqrt(num);
        return n * n == num;
    }
}
