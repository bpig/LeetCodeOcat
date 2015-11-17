package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-15
 */

import java.util.*;

/**
 * Given an array of strings, group anagrams together.
 * <p/>
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Return:
 * <p/>
 * [
 * ["ate", "eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * Note:
 * For the return value,
 * each inner list's elements must follow the lexicographic order.
 * All inputs will be in lower-case.
 */
public class N049_GroupAnagrams_B {
    public List<List<String>> groupAnagrams(String[] strs) {
        Arrays.sort(strs);
        Map<String, List<String>> note = new HashMap<>();
        for (String s : strs) {
            char[] cs = s.toCharArray();
            Arrays.sort(cs);
            String key = new String(cs);
            List<String> value = note.getOrDefault(key, new ArrayList<>());
            value.add(s);
            note.put(key, value);
        }
        return new ArrayList<>(note.values());
    }
}
