package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */

import java.util.*;

/**
 * Given an array of strings, group anagrams together.
 * <p>
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Return:
 * [
 * ["ate", "eat", "tea"],
 * ["nat", "tan"],
 * ["bat"]
 * ]
 * Note:
 * For the return value,
 * each inner list's elements must follow the lexicographic order.
 * All inputs will be in lower-case.
 */

public class N049_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Arrays.sort(strs);
        Map<String, List<String>> ans = new HashMap<>();
        for (String str : strs) {
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            String key = new String(cs);
            List<String> lt = ans.getOrDefault(key, new ArrayList<>());
            lt.add(str);
            ans.put(key, lt);
        }
        return new ArrayList<>(ans.values());
    }
}
