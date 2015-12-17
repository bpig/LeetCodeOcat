package N13;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-09
 */

import java.util.Set;

/**
 * Given a string s and a dictionary of words dict,
 * determine if s can be segmented into a space-separated sequence of one or more dictionary words.
 * <p/>
 * For example, given
 * s = "leetcode",
 * dict = ["leet", "code"].
 * <p/>
 * Return true because "leetcode" can be segmented as "leet code".
 */
public class N139_WordBreak_B {
    public boolean wordBreak(String s, Set<String> wordDict) {
        int[] flag = new int[s.length()];
        return recur(s, 0, wordDict, flag);
    }

    public boolean recur(String s, int start, Set<String> wordDict, int[] flag) {
        if (start == s.length()) {
            return true;
        }
        if (flag[start] != 0) {
            return flag[start] == 1;
        }
        for (int i = start + 1; i <= s.length(); ++i) {
            String sub = s.substring(start, i);
            if (wordDict.contains(sub)) {
                if (recur(s, i, wordDict, flag)) {
                    flag[start] = 1;
                    return true;
                }
            }
        }
        flag[start] = -1;
        return false;
    }
}
