package N29;

//import java.util.HashMap;
import java.util.HashSet;
//import java.util.Map;
import java.util.Set;

/**
 * Created by wenwen.xww on 2015/10/6.
 */

/**
 * Given a pattern and a string str, find if str follows the same pattern.
 * <p>
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

public class N290_WordPattern_O {
    public boolean wordPattern(String pattern, String str) {
//        Map<Character, String> mm = new HashMap<>();
//        Map<String, Character> nn = new HashMap<>();
//
//        String[] array = str.split(" ");
//        if (pattern.length() != array.length) {
//            return false;
//        }
//        int i = 0;
//        for (; i < pattern.length(); i++) {
//            if (mm.containsKey(pattern.charAt(i))) {
//                if (!mm.get(pattern.charAt(i)).equals(array[i])) {
//                    return false;
//                }
//            } else {
//                if (nn.containsKey(array[i])) {
//                    if (!nn.get(array[i]).equals(pattern.charAt(i))) {
//                        return false;
//                    }
//                }
//                mm.put(pattern.charAt(i), array[i]);
//                nn.put(array[i], pattern.charAt(i));
//            }
//        }
//        if (pattern.length() == i) {
//            return true;
//        }
//        return false;
        String[] array = str.split(" ");
        if (pattern.length() != array.length) {
            return false;
        }
        String[] kv = new String[26];
        for (int i = 0; i < pattern.length(); i++) {
            int index = pattern.charAt(i) - 'a';
            if (kv[index] == null) {
                kv[index] = array[i];
            } else {
                if (!kv[index].equals(array[i])) {
                    return false;
                }
            }
        }

        Set<String> tmp = new HashSet<>();
        for (int i = 0; i < kv.length; i++) {
            if (kv[i] == null) {
                continue;
            }
            if (tmp.contains(kv[i])) {
                return false;
            }
            tmp.add(kv[i]);
        }
        return true;
    }
}
