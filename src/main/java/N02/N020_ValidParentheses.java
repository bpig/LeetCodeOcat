package N02;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-28
 */

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * The brackets must close in the correct order,
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class N020_ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] map = new char[256];
        map['('] = ')';
        map['['] = ']';
        map['{'] = '}';
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.add(c);
            } else if (stack.empty() || map[stack.peek()] != c) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.empty();
    }
}
