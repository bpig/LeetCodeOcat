package N00; /**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-08
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc",
 * which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class N003_LongestSubstringWithoutRepeatingCharacters_B {
    public int lengthOfLongestSubstring(String s) {
        int[] tail = new int[128];
        Arrays.fill(tail, -1);
        int pre = 0;
        int len = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
//            len = Math.min(i - tail[c], len + 1);
            // to replace above statement because of performance   450ms -> 380ms
            if (tail[c] == -1) {
                ++len;
            } else {
                len = Math.min(i - tail[c], len + 1);
            }
            tail[c] = i;
            pre = Math.max(pre, len);
        }
        return pre;
    }

    public int score0(String s) {
        int pre = 0;
        Map<Character, Integer> tail = new HashMap<>();
        int len = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (tail.containsKey(c)) {
                len = Math.min(i - tail.get(c), len + 1);
            } else {
                len += 1;
            }
            pre = Math.max(pre, len);
        }
        return pre;
    }
}
