package N09;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */

/**
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
 * <p/>
 * For example,
 * Given:
 * s1 = "aabcc",
 * s2 = "dbbca",
 * When s3 = "aadbbcbcac", return true.
 * When s3 = "aadbbbaccc", return false.
 */
public class N097_InterleavingString_B {

    public boolean isInterleave(String s1, String s2, String s3) {
        char[][] cache = new char[s1.length() + 1][s2.length() + 1];
        return wrap(s1, s2, s3, 0, 0, 0, cache);
    }

    public boolean wrap(String s1, String s2, String s3,
                        int i1, int i2, int i3,
                        char[][] cache) {
        if (cache[i1][i2] != 0) {
            return cache[i1][i2] == 1;
        }
        boolean ret = recur(s1, s2, s3, i1, i2, i3, cache);
        cache[i1][i2] = ret ? (char)1 : (char)-1;
        return ret;
    }

    public boolean recur(String s1, String s2, String s3,
                         int i1, int i2, int i3,
                         char[][] cache) {
        if (i3 == s3.length()) {
            return i1 == s1.length() && i2 == s2.length();
        }
        char c = s3.charAt(i3);
        if (i1 < s1.length()
                && s1.charAt(i1) == c
                && wrap(s1, s2, s3, i1 + 1, i2, i3 + 1, cache)) {
            return true;
        }
        if (i2 < s2.length()
                && s2.charAt(i2) == c
                && wrap(s1, s2, s3, i1, i2 + 1, i3 + 1, cache)) {
            return true;
        }
        return false;
    }
}
