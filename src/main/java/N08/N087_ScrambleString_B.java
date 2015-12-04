package N08;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-04
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s1, we may represent it as a binary tree
 * by partitioning it to two non-empty substrings recursively.
 * <p/>
 * Below is one possible representation of s1 = "great":
 * <p/>
 * `     great
 * `    /    \
 * `   gr    eat
 * `  / \    /  \
 * ` g   r  e   at
 * `           / \
 * `          a   t
 * To scramble the string, we may choose any non-leaf node and swap its two children.
 * <p/>
 * For example, if we choose the node "gr" and swap its two children,
 * it produces a scrambled string "rgeat".
 * <p/>
 * `     rgeat
 * `    /    \
 * `   rg    eat
 * `  / \    /  \
 * ` r   g  e   at
 * `           / \
 * `          a   t
 * We say that "rgeat" is a scrambled string of "great".
 * <p/>
 * Similarly, if we continue to swap the children of nodes "eat" and "at",
 * it produces a scrambled string "rgtae".
 * <p/>
 * `     rgtae
 * `    /    \
 * `   rg    tae
 * `  / \    /  \
 * ` r   g  ta  e
 * `       / \
 * `      t   a
 * We say that "rgtae" is a scrambled string of "great".
 * <p/>
 * Given two strings s1 and s2 of the same length,
 * determine if s2 is a scrambled string of s1.
 */
public class N087_ScrambleString_B {
    // later than dp
    public boolean cyk(String s1, String s2) {
        int len = s1.length();
        if (len == 0) {
            return true;
        }
        if (len == 1) {
            return s1.equals(s2);
        }
        //CYK
        int[][][] p = new int[len + 1][len][len];

        //p[i][j][k] means s1[j..j+i] is scrambled string of s2[k..k+i]
        for (int k = 0; k < len; k++) {
            for (int j = 0; j < len; j++) {
                p[1][j][k] = s1.charAt(j) == s2.charAt(k) ? 1 : 0;
            }
        }

        for (int i = 2; i <= len; i++) {//length of span
            for (int j = 0; j <= len - i; j++) {//start of span
                for (int l = 0; l <= len - i; l++) {//start of span2
                    for (int k = 1; k < i; k++) {//partition of span
                        if (p[k][j][l] != 0 && p[i - k][j + k][l + k] != 0
                                || p[k][j][l + i - k] != 0 && p[i - k][j + k][l] != 0) {
                            p[i][j][l] = 1;
                        }
                    }
                }
            }
        }
        return p[len][0][0] != 0;
    }

    Map<String, Boolean> cache = new HashMap<>();

    public boolean wrap(String s1, String s2) {
        String key = s1 + "_" + s2;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        boolean ret = recur(s1, s2);
        cache.put(key, ret);
        return ret;
    }

    public boolean isScramble(String s1, String s2) {
        return wrap(s1, s2);
    }

    public boolean recur(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] ct = new int[26];
        for (int i = 0; i < s1.length(); ++i) {
            ct[s1.charAt(i) - 'a']++;
            ct[s2.charAt(i) - 'a']--;
        }
        for (int c : ct) {
            if (c != 0) {
                return false;
            }
        }
        for (int i = 1; i < s1.length(); ++i) {
            if (wrap(s1.substring(0, i), s2.substring(0, i))
                    && wrap(s1.substring(i), s2.substring(i))) {
                return true;
            }
            if (wrap(s1.substring(0, i), s2.substring(s2.length() - i))
                    && wrap(s1.substring(i), s2.substring(0, s2.length() - i))) {
                return true;
            }
        }
        return false;
    }
}




