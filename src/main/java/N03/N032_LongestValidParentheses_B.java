package N03;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-24
 */

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

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
    boolean isValid(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')' && count-- == 0) {
                return false;
            }
        }
        return count == 0;
    }

    public int scoreB(String s) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(s);
        visited.add(s);
        while (!queue.isEmpty()) {
            String t = queue.poll();
            if (isValid(t)) {
                return t.length();
            }
            String left = t.substring(0, t.length() - 1);
            if (!visited.contains(left)) {
                queue.add(left);
                visited.add(left);
            }
            String right = t.substring(1);
            if (!visited.contains(right)) {
                queue.add(right);
                visited.add(right);
            }
        }
        return 0;
    }

    public int longestValidParentheses(String s) {
        if (s == null || s.length() <= 1) {
            return 0;
        }
        int start = -1;
        int res = 0;
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
                continue;
            }
            if (!stack.isEmpty()) {
                stack.pop();
                if (!stack.isEmpty()) {
                    res = Math.max(res, i - stack.peek());
                } else {
                    res = Math.max(res, i - start);
                }
            } else {
                start = i;
            }
        }
        return res;
    }

}
