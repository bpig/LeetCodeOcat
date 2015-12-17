package N22;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-08
 */

import java.util.StringTokenizer;

/**
 * Implement a basic calculator to evaluate a simple expression string.
 * <p/>
 * The expression string may contain open ( and closing parentheses ),
 * the plus + or minus sign -, non-negative integers and empty spaces .
 * <p/>
 * You may assume that the given expression is always valid.
 * <p/>
 * Some examples:
 * "1 + 1" = 2
 * " 2-1 + 2 " = 3
 * "(1+(4+5+2)-3)+(6+8)" = 23
 * Note: Do not use the eval built-in library function.
 */
public class N224_BasicCalculator_B {
    public int calculate(String s) {
        return cal(new StringTokenizer(s, " ()-+", true));
    }

    private int cal(StringTokenizer st) {
        int ans = 0;
        boolean plus = true;
        while (st.hasMoreTokens()) {
            int val;
            String token = st.nextToken();
            switch (token) {
                case "(":
                    val = cal(st);
                    ans += plus ? val : -val;
                    break;
                case ")":
                    return ans;
                case "+":
                    plus = true;
                    break;
                case "-":
                    plus = false;
                    break;
                case " ":
                    break;
                default:
                    val = Integer.valueOf(token);
                    ans += plus ? val : -val;
                    break;
            }
        }
        return ans;
    }
}
