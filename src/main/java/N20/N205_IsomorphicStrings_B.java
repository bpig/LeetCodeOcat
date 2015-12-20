package N20;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-19
 */

/**
 * Given two strings s and t, determine if they are isomorphic.
 * <p/>
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * <p/>
 * All occurrences of a character must be replaced with another character
 * while preserving the order of characters.
 * No two characters may map to the same character but a character may map to itself.
 * <p/>
 * For example,
 * Given "egg", "add", return true.
 * <p/>
 * Given "foo", "bar", return false.
 * <p/>
 * Given "paper", "title", return true.
 * <p/>
 * wonderful
 * https://leetcode.com/discuss/48674/python-different-solutions-dictionary-etc
 */
public class N205_IsomorphicStrings_B {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] kv1 = new int[256];
        int[] kv2 = new int[256];
        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (kv1[c1] != kv2[c2]) {
                return false;
            }
            kv1[c1] = i + 1;
            kv2[c2] = i + 1;
        }
        return true;
    }

    public boolean scoreA(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        String sn = trans(s);
        String tn = trans(t);
        return sn.equals(tn);
    }

    String trans(String s) {
        int idx = 1;
        StringBuffer sb = new StringBuffer();
        int[] kv = new int[256];
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (kv[c] == 0) {
                kv[c] = idx++;
            }
            sb.append(kv[c]);
        }
        return sb.toString();
    }
}
