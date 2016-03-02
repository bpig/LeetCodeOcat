package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-29
 */

/**
 * Implement wildcard pattern matching with support for '?' and '*'.
 * <p>
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 * <p>
 * The matching should cover the entire input string (not partial).
 * <p>
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * <p>
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "*") → true
 * isMatch("aa", "a*") → true
 * isMatch("ab", "?*") → true
 * isMatch("aab", "c*a*b") → false
 */
public class N044_WildcardMatching {
    public boolean isMatch(String s, String p) {
        int ls = s.length();
        int lp = p.length();
        boolean[][] match = new boolean[ls + 1][lp + 1];
        match[0][0] = true;
        for (int i = 1; i <= lp; ++i) {
            if (p.charAt(i - 1) != '*') {
                break;
            }
            match[0][i] = true;
        }
        for (int i = 1; i <= ls; ++i) {
            for (int j = 1; j <= lp; ++j) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    match[i][j] = match[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    match[i][j] = match[i][j - 1] || match[i - 1][j];
                } else {
                    match[i][j] = false;
                }
            }
        }
        return match[ls][lp];
    }

    public boolean isMatchb(String s, String p) {
        int ls = s.length();
        int lp = p.length();
        boolean[][] match = new boolean[ls + 1][lp + 1];
        match[ls][lp] = true;
        for (int i = lp - 1; i >= 0; i--) {
            if (p.charAt(i) == '*') {
                match[ls][i] = true;
                continue;
            }
            break;
        }
        for (int i = ls - 1; i >= 0; i--) {
            for (int j = lp - 1; j >= 0; j--) {
                if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
                    match[i][j] = match[i + 1][j + 1];
                } else if (p.charAt(j) == '*') {
                    match[i][j] = match[i + 1][j] || match[i][j + 1] || match[i + 1][j + 1];
                } else {
                    match[i][j] = false;
                }
            }
        }
        return match[0][0];
    }
}
