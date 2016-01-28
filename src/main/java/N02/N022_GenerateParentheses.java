package N02;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-28
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses,
 * write a function to generate all combinations of well-formed parentheses.
 * <p/>
 * For example, given n = 3, a solution set is:
 * <p/>
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 */
public class N022_GenerateParentheses {
    List<String> ans;

    void gen(StringBuilder sb, int left, int right) {
        if (left == 0 && right == 0) {
            ans.add(sb.toString());
            return;
        }
        if (left > 0) {
            gen(sb.append('('), left - 1, right + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (right > 0) {
            gen(sb.append(')'), left, right - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public List<String> generateParenthesisRecur(int n) {
        ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        gen(sb, n, 0);
        return ans;
    }

    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        if (n == 0) {
            return ans;
        }
        StringBuilder sb = new StringBuilder();
        recur(n, 0, sb);
        return ans;
    }

    void recur(int left, int right, StringBuilder sb) {
        sb.append('(');
        right++;
        left--;
        if (left == 0) {
            for (int i = 0; i < right; ++i) {
                sb.append(')');
            }
            ans.add(sb.toString());
        } else {
            for (int i = 0; i <= right; ++i) {
                if (i != 0) {
                    sb.append(')');
                }
                recur(left, right - i, sb);
            }
        }
        sb.delete(sb.length() - right - 1, sb.length());
    }
}
