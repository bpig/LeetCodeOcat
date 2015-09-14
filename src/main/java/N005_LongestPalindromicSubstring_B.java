/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-08
 */

/**
 * Given a string S, find the longest palindromic substring in S.
 * You may assume that the maximum length of S is 1000,
 * and there exists one unique longest palindromic substring.
 */
public class N005_LongestPalindromicSubstring_B {
    private int resultLow = 0;
    private int resultHigh = 0;

    private void check(int low, int high, String s) {
        while (low >= 0 && high < s.length()
                && s.charAt(low) == s.charAt(high)) {
            if (high - low > resultHigh - resultLow) {
                resultLow = low;
                resultHigh = high;
            }
            --low;
            ++high;
        }
    }

    public String longestPalindrome(String s) {
        resultLow = 0;
        resultHigh = 0;
        if (s.length() <= 1) {
            return s;
        }
        for (int i = 1; i < s.length(); ++i) {
            check(i - 1, i + 1, s);
            check(i - 1, i, s);
        }

        return s.substring(resultLow, resultHigh + 1);
    }
}
