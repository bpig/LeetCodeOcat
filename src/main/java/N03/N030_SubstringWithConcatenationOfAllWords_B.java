package N03;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-20
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * You are given a string, s, and a list of words, words,
 * that are all of the same length.
 * Find all starting indices of substring(s) in s
 * that is a concatenation of each word in words exactly once and without any intervening characters.
 * <p/>
 * For example, given:
 * s: "barfoothefoobarman"
 * words: ["foo", "bar"]
 * <p/>
 * You should return the indices: [0,9].
 * (order does not matter).
 */
public class N030_SubstringWithConcatenationOfAllWords_B {
    List<Integer> indices = new ArrayList<>();
    int wordWidth = 0;
    void check(List<List<Integer>> indexes, List<Integer> cols) {
        int layout = cols.size();
        if (layout == indexes.size()) {
            List<Integer> cp = new ArrayList<>(cols);
            Collections.sort(cp);
            for (int i = 1; i < cp.size(); ++i) {
                if (cp.get(i) != cp.get(i-1) + wordWidth) {
                    return;
                }
            }
            indices.add(cp.get(0));
            return;
        }
        List<Integer> data = indexes.get(layout);
        for (int i = 0; i < data.size(); ++i) {
            cols.add(data.get(i));
            check(indexes, cols);
            cols.remove(cols.size() - 1);
        }
    }
    public List<Integer> findSubstring(String s, String[] words) {
        List<List<Integer>> indexes = new ArrayList<>();
        wordWidth = words[0].length();
        for (int i = 0; i < words.length; ++i) {
            List<Integer> ls = new ArrayList<>();
            int idx = 0;
            while (true) {
                idx = s.indexOf(words[i], idx);
                if (idx == -1) {
                    break;
                }
                ls.add(idx);
                idx++;
            }
            indexes.add(ls);
        }
        List<Integer> cols = new ArrayList<>();
        check(indexes, cols);
        return indices;
    }
}
