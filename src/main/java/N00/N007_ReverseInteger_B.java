package N00; /**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-10
 */

/**
 * Reverse digits of an integer.
 * <p/>
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * <p/>
 * click to show spoilers.
 * <p/>
 * Have you thought about this?
 * Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
 * <p/>
 * If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
 * <p/>
 * Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer,
 * then the reverse of 1000000003 overflows. How should you handle such cases?
 * <p/>
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 * <p/>
 * Update (2014-11-10):
 * Test cases had been added to test the overflow behavior.
 */
public class N007_ReverseInteger_B {
    public int reverse(int x) {
        long r = 0;
        while (x != 0) {
            r = r * 10 + x % 10;
            x /= 10;
            System.out.println(r);
        }
        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)r;
    }
}
