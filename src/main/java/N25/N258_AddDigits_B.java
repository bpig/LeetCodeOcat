package N25;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-07
 */

/**
 * Given a non-negative integer num,
 * repeatedly add all its digits until the result has only one digit.
 * <p/>
 * For example:
 * <p/>
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2.
 * Since 2 has only one digit, return it.
 * <p/>
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */
public class N258_AddDigits_B {
    public int formula(int num) {
        // https://en.wikipedia.org/wiki/Digital_root
        // same as 1 + (num - 1) % 9;
        return num - (num - 1) / 9 * 9;
    }

    public int addDigits(int num) {
        while (num >= 10) {
            num = num / 10 + num % 10;
        }
        return num;
    }
}
