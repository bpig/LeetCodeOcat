package N21;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-19
 */

/**
 * Given a string S,
 * you are allowed to convert it to a palindrome
 * by adding characters in front of it.
 * Find and return the shortest palindrome you can find by performing this transformation.
 * <p/>
 * For example:
 * <p/>
 * Given "aacecaaa", return "aaacecaaa".
 * <p/>
 * Given "abcd", return "dcbabcd".
 */
public class N214_ShortestPalindrome_B {
    public String shortestPalindrome(String s) {
        int n = s.length();
        if (n == 0) {
            return s;
        }
        int len = Integer.MIN_VALUE;
        for (int i = 0; i < n; ) {
            int left = i;
            int right = i;
            while (right < n - 1 && s.charAt(right) == s.charAt(right + 1)) {
                right++;
            }
            i = right + 1;
            int may = trans(s, left, right);
            len = Math.max(may, len);
        }
        StringBuffer sb = new StringBuffer(s.substring(len));
        return sb.reverse().toString() + s;
    }

    int trans(String s, int left, int right) {
        left--;
        right++;
        for (; left >= 0 && right < s.length(); --left, ++right) {
            if (s.charAt(left) != s.charAt(right)) {
                return 0;
            }
        }
        if (left == -1) {
            return right;
        } else {
            return 0;
        }
    }
}
