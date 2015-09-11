/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-08
 */

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc",
 * which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class N003_LongestSubstringWithoutRepeatingCharacters_B {
    public int lengthOfLongestSubstring(String s) {
        int pre = 0;
        for (int i = 0; i < s.length(); ++i) {
            String sub = s.substring(0, i + 1);
            Set<Character> flags = new HashSet<>();
            int len = 0;
            for (; len < sub.length(); ++len) {
                int idx = sub.length() - 1 - len;
                if (flags.contains(sub.charAt(idx))) {
                    break;
                }
                flags.add(sub.charAt(idx));
            }
            pre = Math.max(pre, len);
        }
        return pre;
    }
}
