package N16;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-14
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Given two integers representing the numerator and denominator of a fraction,
 * return the fraction in string format.
 * <p/>
 * If the fractional part is repeating, enclose the repeating part in parentheses.
 * <p/>
 * For example,
 * <p/>
 * Given numerator = 1, denominator = 2, return "0.5".
 * Given numerator = 2, denominator = 1, return "2".
 * Given numerator = 2, denominator = 3, return "0.(6)".
 * <p/>
 * https://leetcode.com/problems/fraction-to-recurring-decimal/
 */
public class N166_FractionToRecurringDecimal_B {
    public String fractionToDecimal(int numerator, int denominator) {
        boolean neg = numerator < 0 && denominator > 0 || numerator > 0 && denominator < 0;
        long nl = Math.abs((long) numerator);
        long dl = Math.abs((long) denominator);
        Map<Long, Integer> remain = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        long dealer = nl / dl;
        sb.append(dealer);
        nl %= dl;

        if (nl != 0) {
            sb.append(".");
        }
        int index = 0;
        while (nl != 0) {
            nl *= 10;
            dealer = Math.abs(nl / dl);
            if (!remain.containsKey(nl)) {
                sb.append(dealer);
                remain.put(nl, index++);
            } else {
                int firstIndex = 1 + remain.get(nl) + sb.indexOf(".");
                sb.insert(firstIndex, '(');
                sb.append(")");
                break;
            }
            nl %= dl;
        }
        if (neg) {
            sb.insert(0, "-");
        }
        return sb.toString();
    }
}
