package N32;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/4/29
 */

/**
 * Given an integer, write a function to determine if it is a power of three.
 * <p>
 * Follow up:
 * Could you do it without using any loop / recursion?
 */
public class N326_PowerOfThree_B {
    final int Max3PowerInt = 1162261467;

    public boolean isPowerOfThree(int n) {
        if (n <= 0 || n > Max3PowerInt) {
            return false;
        }
        return Max3PowerInt % n == 0;
    }
}
