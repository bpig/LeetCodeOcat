package N01; /**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-11
 */

/**
 * Implement regular expression matching with support for '.' and '*'.
 * <p/>
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * <p/>
 * The matching should cover the entire input string (not partial).
 * <p/>
 * The function prototype should be:
 * bool isMatchRecur(const char *s, const char *p)
 * isMatch("aa","a") -> false
 * isMatch("aa","aa") -> true
 * isMatch("aaa","aa") -> false
 * isMatch("aa", "a*") -> true
 * isMatch("aa", ".*") -> true
 * isMatch("ab", ".*") -> true
 * isMatch("aab", "c*a*b") -> true
 */
public class N010_RegularExpressionMatching_B {
    public boolean isMatch(String s, String p) {
        return recurMatch(s, p, 0, 0);
    }

    private boolean charMatch(char x, char y) {
        return x == y || y == '.';
    }

    private boolean recurMatch(String s, String p, int i, int j) {
        if (j == p.length()) {
            return i == s.length();
        }
        if (j == p.length() - 1 || p.charAt(j + 1) != '*') {
            if (i == s.length() || !charMatch(s.charAt(i), p.charAt(j))) {
                return false;
            }
            return recurMatch(s, p, i + 1, j + 1);
        }
        while (i < s.length() && charMatch(s.charAt(i), p.charAt(j))) {
            if (recurMatch(s, p, i, j + 2)) {
                return true;
            }
            ++i;
        }
        return recurMatch(s, p, i, j + 2);
    }

}



















