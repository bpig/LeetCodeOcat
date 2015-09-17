package N02;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-15
 */

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * <p/>
 * The brackets must close in the correct order,
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class N022_ValidParentheses_B {
    boolean isPair(char c0, char c1) {
        if (c0 == '(' && c1 == ')'
                || c0 == '[' && c1 == ']'
                || c0 == '{' && c1 == '}') {
            return true;
        }
        return false;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (stack.empty() || !isPair(stack.peek(), c)) {
                stack.add(c);
            } else {
                stack.pop();
            }
        }
        return stack.empty();
    }
}
