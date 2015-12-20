package N26;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-19
 */

/**
 * Write a program to check whether a given number is an ugly number.
 * <p/>
 * Ugly numbers are positive numbers
 * whose prime factors only include 2, 3, 5.
 * For example, 6, 8 are ugly while 14 is not ugly
 * since it includes another prime factor 7.
 * <p/>
 * Note that 1 is typically treated as an ugly number.
 * <p/>
 * https://leetcode.com/problems/ugly-number/
 */
public class N263_UglyNumber_B {
    int shrink(int num, int factor) {
        while (num > 0 && num % factor == 0) {
            num /= factor;
        }
        return num;
    }

    public boolean isUgly(int num) {
        num = shrink(num, 2);
        num = shrink(num, 3);
        num = shrink(num, 5);
        return num == 1;
    }
}
