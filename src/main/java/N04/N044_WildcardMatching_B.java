package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-16
 */

/**
 * Implement wildcard pattern matching with support for '?' and '*'.
 * <p/>
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 * <p/>
 * The matching should cover the entire input string (not partial).
 * <p/>
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * <p/>
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "*") → true
 * isMatch("aa", "a*") → true
 * isMatch("ab", "?*") → true
 * isMatch("aab", "c*a*b") → false
 */
public class N044_WildcardMatching_B {
    public boolean isMatch(String s, String p) {
        boolean[][] match = new boolean[s.length() + 1][p.length() + 1];
        match[s.length()][p.length()] = true;
        for (int i = p.length() - 1; i >= 0; i--) {
            if (p.charAt(i) == '*') {
                match[s.length()][i] = true;
                continue;
            }
            break;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = p.length() - 1; j >= 0; j--) {
                if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
                    match[i][j] = match[i + 1][j + 1];
                } else if (p.charAt(j) == '*') {
                    match[i][j] = match[i + 1][j] || match[i][j + 1];
                } else {
                    match[i][j] = false;
                }
            }
        }
        return match[0][0];
    }

    public boolean scoreB(String s, String p) {
        return recur(s, p, 0, 0);
    }

    boolean charMatch(char x, char y) {
        return x == y || y == '?';
    }

    boolean recur(String s, String p, int i, int j) {
        if (j == p.length()) {
            return i == s.length();
        }
        if (p.charAt(j) != '*') {
            if (i == s.length() || !charMatch(s.charAt(i), p.charAt(j))) {
                return false;
            }
            return recur(s, p, i + 1, j + 1);
        }
        while (i < s.length()) {
            if (recur(s, p, i, j + 1)) {
                return true;
            }
            ++i;
        }
        return recur(s, p, i, j + 1);
    }
}









