package N03;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-20
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (words.length == 0) {
            return res;
        }
        int len = words[0].length();
        int num = words.length;
        if (len * num > s.length()) {
            return res;
        }

        //histogram of words in L
        Map<String, Integer> dic = new HashMap<>();
        for (String word : words) {
            dic.put(word, dic.getOrDefault(word, 0) + 1);
        }

        //the word that starts from i in S
        String[] sDic = new String[s.length() - len + 1];
        for (int i = 0; i < sDic.length; i++) {
            String sub = s.substring(i, i + len);
            if (dic.containsKey(sub)) {
                sDic[i] = sub;
            } else {
                sDic[i] = "";
            }
        }

        //traverse in order of 0,0+len,...,1,1+len,...len-1,len-1+len...therefore it is O(n) despite of two loops
        for (int i = 0; i < len; i++) {
            //start of concatenation
            int start = i;
            //number of words found
            int found = 0;
            //dynamic word histogram of words in substring(start,j);
            Map<String, Integer> tempDic = new HashMap<>();
            for (int j = i; j <= s.length() - len; j = j + len) {
                String word = sDic[j];
                if (word.equals("")) {
                    tempDic = new HashMap<>();
                    start = j + len;
                    found = 0;
                    continue;
                } else {
                    tempDic.put(word, tempDic.getOrDefault(word, 0) + 1);
                    found++;
                }
                // if we over-count a word, delete the first word in front.
                // Also delete the words before that.
                if (tempDic.get(word) > dic.get(word)) {
                    while (!sDic[start].equals(word)) {
                        tempDic.put(sDic[start], tempDic.get(sDic[start]) - 1);
                        start += len;
                        found--;
                    }
                    tempDic.put(word, tempDic.get(word) - 1);
                    start += len;
                    found--;
                }
                if (found == num) {
                    res.add(start);
                }
            }
        }
        return res;
    }

    public List<Integer> scoreB(String s, String[] words) {
        Map<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        int n = s.length();
        int num = words.length;
        int len = words[0].length();
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i <= n - num * len; ++i) {
            Map<String, Integer> seen = new HashMap<>();
            int j = 0;
            for (; j < num; ++j) {
                String word = s.substring(i + j * len, i + j * len + len);
                if (!counts.containsKey(word)) {
                    break;
                }
                seen.put(word, seen.getOrDefault(word, 0) + 1);
                if (seen.get(word) > counts.get(word)) {
                    break;
                }
            }
            if (j == num) {
                ret.add(i);
            }
        }
        return ret;
    }
}
