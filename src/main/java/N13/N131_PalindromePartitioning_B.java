package N13;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-09
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string s,
 * partition s such that every substring of the partition is a palindrome.
 * <p/>
 * Return all possible palindrome partitioning of s.
 * <p/>
 * For example, given s = "aab",
 * Return
 * <p/>
 * [
 * ["aa","b"],
 * ["a","a","b"]
 * ]
 */
public class N131_PalindromePartitioning_B {
    List<List<String>> ans;

    boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        for (; i < j; ++i, --j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    void recur(String s, int start, List<String> trace) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(trace));
            return;
        }
        for (int i = start + 1; i <= s.length(); ++i) {
            String sub = s.substring(start, i);
            if (isPalindrome(sub)) {
                trace.add(sub);
                recur(s, i, trace);
                trace.remove(trace.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        ans = new ArrayList<>();
        List<String> trace = new ArrayList<>();
        recur(s, 0, trace);
        return ans;
    }
}
