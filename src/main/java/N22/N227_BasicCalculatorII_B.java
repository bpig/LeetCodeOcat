package N22;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-17
 */

/**
 * Implement a basic calculator to evaluate a simple expression string.
 * <p/>
 * The expression string contains only non-negative integers, +, -, *, / operators
 * and empty spaces . The integer division should truncate toward zero.
 * <p/>
 * You may assume that the given expression is always valid.
 * <p/>
 * Some examples:
 * "3+2*2" = 7
 * " 3/2 " = 1
 * " 3+5 / 2 " = 5
 * Note: Do not use the eval built-in library function.
 */
public class N227_BasicCalculatorII_B {
    public int scoreA(String s) {
        if (s == null) {
            return 0;
        }
        int left = 0;
        int num = 0;
        int opt = 0;
        int sign = 1;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            }
            if (Character.isDigit(c)) {         // if c is digit, add up the number
                num = 10 * num + c - '0';
                continue;
            }
            switch (opt) {
                case 1:
                    num = left * num;
                    break;
                case -1:
                    num = left / num;
                    break;
            }
            opt = 0;
            // c is +-*/
            switch (c) {
                case '+':
                case '-':
                    res += sign * num;
                    sign = c == '+' ? 1 : -1;
                    break;
                case '*':
                case '/':
                    left = num;
                    opt = c == '*' ? 1 : -1;
                    break;
            }
            num = 0;
        }

        switch (opt) {
            case 1:
                res += sign * left * num;
                break;
            case -1:
                res += sign * left / num;
                break;
            default:
                res += sign * num;
                break;
        }
        return res;
    }

    public int calculate(String s) {
        if (s == null) {
            return 0;
        }
        s = s.trim().replaceAll(" +", "");
        int length = s.length();

        int res = 0;
        long pre = 0; // initial preVal is 0
        char sign = '+'; // initial sign is +
        int i = 0;
        while (i < length) {
            long cur = 0;
            while (i < length && (int) s.charAt(i) <= 57 && (int) s.charAt(i) >= 48) { // int
                cur = cur * 10 + s.charAt(i) - '0';
                i++;
            }
            if (sign == '+') {
                res += pre;  // update res
                pre = cur;
            } else if (sign == '-') {
                res += pre;  // update res
                pre = -cur;
            } else if (sign == '*') {
                pre = pre * cur; // not update res, combine pre & cur and keep loop
            } else if (sign == '/') {
                pre = pre / cur; // not update res, combine pre & cur and keep loop
            }
            if (i < length) { // getting new sign
                sign = s.charAt(i);
                i++;
            }
        }
        res += pre;
        return res;
    }
}
