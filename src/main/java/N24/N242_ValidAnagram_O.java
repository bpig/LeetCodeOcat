package N24;

/**
 * Created by wenwen.xww on 2015/10/5.
 */

        import java.util.HashMap;
        import java.util.Map;

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

public class N242_ValidAnagram_O {
    public boolean isAanagram(String s, String t) {

        int[] tmp = new int[26];
        for (int i = 0; i < s.length(); i++) {
            tmp[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            tmp[t.charAt(i) - 'a']--;
        }
        boolean res = true;
        for (int i = 0; i < 26; i++) {
            if (tmp[i] != 0) {
                res = false;
                break;
            }
        }
        return res;
    }
}
