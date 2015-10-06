package N29;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-10-06
 */

import java.util.HashSet;
import java.util.Set;

/**
 * Given a pattern and a string str, find if str follows the same pattern.
 * <p/>
 * Examples:
 * pattern = "abba", str = "dog cat cat dog" should return true.
 * pattern = "abba", str = "dog cat cat fish" should return false.
 * pattern = "aaaa", str = "dog cat cat dog" should return false.
 * pattern = "abba", str = "dog dog dog dog" should return false.
 * Notes:
 * Both pattern and str contains only lowercase alphabetical letters.
 * Both pattern and str do not have leading or trailing spaces.
 * Each word in str is separated by a single space.
 * Each letter in pattern must map to a word with length that is at least 1.
 */
public class N290_WordPattern_B {
    public boolean wordPattern(String pattern, String str) {
        String[] kv = new String[26];
        String[] items = str.split(" ");
        if (items.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); ++i) {
            int key = pattern.charAt(i) - 'a';
            if (kv[key] == null) {
                kv[key] = items[i];
                continue;
            }
            if (!kv[key].equals(items[i])) {
                return false;
            }
        }
        Set<String> unique = new HashSet<>();
        for (String s : kv) {
            if (s == null) { continue; }
            if (unique.contains(s)) {
                return false;
            }
            unique.add(s);
        }
        return true;
    }
}
