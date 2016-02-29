package N03;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-28
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * You are given a string, s, and a list of words, words,
 * that are all of the same length.
 * Find all starting indices of substring(s) in s
 * that is a concatenation of each word in words exactly once
 * and without any intervening characters.
 * <p>
 * For example, given:
 * s: "barfoothefoobarman"
 * words: ["foo", "bar"]
 * <p>
 * You should return the indices: [0,9].
 * (order does not matter).
 */
public class N030_SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        int ct = words.length;
        if (ct == 0) {
            return ans;
        }
        int len = words[0].length();
        if (ct * len > s.length()) {
            return ans;
        }

        Map<String, Integer> dict = new HashMap<>();
        for (String word : words) {
            dict.put(word, dict.getOrDefault(word, 0) + 1);
        }
        String[] indices = new String[s.length() - len + 1];
        for (int i = 0; i < indices.length; ++i) {
            String str = s.substring(i, i + len);
            if (dict.containsKey(str)) {
                indices[i] = str;
            } else {
                indices[i] = "";
            }
        }

        for (int i = 0; i < len; ++i) {
            int start = i;
            int found = 0;
            Map<String, Integer> search = new HashMap<>();
            for (int j = i; j <= s.length() - len; j += len) {
                String word = indices[j];
                if (word.equals("")) {
                    start = j + len;
                    found = 0;
                    search = new HashMap<>();
                    continue;
                } else {
                    search.put(word, search.getOrDefault(word, 0) + 1);
                    found++;
                }

                if (search.get(word) > dict.get((word))) {
                    while (!indices[start].equals(word)) {
                        String pre = indices[start];
                        start += len;
                        search.put(pre, search.get(pre) - 1);
                        found--;
                    }
                    start += len;
                    search.put(word, search.get(word) - 1);
                    found--;
                }
                if (found == ct) {
                    ans.add(start);
                }
            }
        }
        return ans;
    }
}
