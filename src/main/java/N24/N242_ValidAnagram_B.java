package N24;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-10-05
 */

import java.util.Arrays;

/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * <p/>
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * <p/>
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */
public class N242_ValidAnagram_B {
    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ts);
        return new String(cs).equals(new String(ts));
    }

    public boolean scoreTop(String s, String t) {
        int[] kv = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            kv[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); ++i) {
            kv[t.charAt(i) - 'a']--;
        }
        for (int i : kv) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
