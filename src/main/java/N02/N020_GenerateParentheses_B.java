package N02;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-15
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
public class N020_GenerateParentheses_B {
    List<String> list = new ArrayList<>();

    void repeatAppend(StringBuilder builder, char c, int repeat) {
        for (int i = 0; i < repeat; ++i) {
            builder.append(c);
        }
    }

    void repeatRemove(StringBuilder builder, int repeat) {
        for (int i = 0; i < repeat; ++i) {
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    void recur(int left, int right, StringBuilder builder) {
        if (left == 0) {
            repeatAppend(builder, ')', right);
            list.add(builder.toString());
            repeatRemove(builder, right);
            return;
        }

        for (int i = 0; i <= right; ++i) {
            repeatAppend(builder, ')', i);
            builder.append('(');
            recur(left - 1, right + 1 - i, builder);
            repeatRemove(builder, i + 1);
        }
    }

    void gen(String str, int left, int right) {
        if (left == 0 && right == 0) {
            list.add(str);
            return;
        }
        if (left > 0) {
            gen(str + "(", left - 1, right + 1);
        }
        if (right > 0) {
            gen(str + ")", left, right - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        list.clear();
        String str = new String();
        gen(str, n, 0);
        return list;
    }

    public List<String> score1(int n) {
        list.clear();
        StringBuilder builder = new StringBuilder();
        recur(n, 0, builder);
        return list;
    }
}
