package N03;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-24
 */

import java.util.Stack;

/**
 * Given a string containing just the characters '(' and ')',
 * find the length of the longest valid (well-formed) parentheses substring.
 * <p/>
 * For "(()", the longest valid parentheses substring is "()", which has length = 2.
 * <p/>
 * Another example is ")()())",
 * where the longest valid parentheses substring is "()()", which has length = 4.
 */
public class N032_LongestValidParentheses_B {
    public int validLength(String s) {
        Stack<Character> stack = new Stack<>();
        int idx = s.length() - 1;
        for (; idx >= 0; --idx) {
            if (stack.size() > s.length() / 2) {
                break;
            }
            char c = s.charAt(idx);
            if (c == '(') {
                if (stack.empty()) {
                    break;
                } else {
                    stack.pop();
                }
            } else {
                stack.add(c);
            }
        }
        return s.length() - idx - 1 - stack.size();
    }
    public int longestValidParentheses(String s) {
        return 0;
    }

}
