package N03;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-29
 */

import java.util.LinkedList;

/**
 * Given a string containing just the characters '(' and ')',
 * find the length of the longest valid (well-formed) parentheses substring.
 * <p>
 * For "(()", the longest valid parentheses substring is "()", which has length = 2.
 * <p>
 * Another example is ")()())",
 * where the longest valid parentheses substring is "()()", which has length = 4.
 */
public class N032_LongestValidParentheses {
    public int longestValidParentheses(String s) {
        if (s == null || s.length() <= 1) {
            return 0;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int start = -1;
        int ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
                continue;
            }
            if (!stack.isEmpty()) {
                stack.pop();
                if (!stack.isEmpty()) {
                    ans = Math.max(ans, i - stack.peek());
                } else {
                    ans = Math.max(ans, i - start);
                }
            } else {
                start = i;
            }
        }
        return ans;
    }
}
