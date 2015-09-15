package N00; /**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-11
 */

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * <p/>
 * Some hints:
 * Could negative integers be palindromes? (ie, -1)
 * <p/>
 * If you are thinking of converting the integer to string, note the restriction of using extra space.
 * <p/>
 * You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?
 * <p/>
 * There is a more generic way of solving this problem.
 */

public class N009_PalindromeNumber_B {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long y = 0;
        int tmp = x;
        while (tmp > 0) {
            int remain = tmp % 10;
            y = y * 10 + remain;
            tmp /= 10;
        }
        return y == (long)x;
    }
}
