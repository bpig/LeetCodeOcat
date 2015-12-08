package N28;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-07
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string that contains only digits 0-9 and a target value,
 * return all possibilities to add binary operators (not unary) +, -, or * between the digits
 * so they evaluate to the target value.
 * <p/>
 * Examples:
 * "123", 6 -> ["1+2+3", "1*2*3"]
 * "232", 8 -> ["2*3+2", "2+3*2"]
 * "105", 5 -> ["1*0+5","10-5"]
 * "00", 0 -> ["0+0", "0-0", "0*0"]
 * "3456237490", 9191 -> []
 */
public class N282_ExpressionAddOperators_B {


    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= num.length(); i++) {
            if (i >= 2 && num.charAt(0) == '0') {
                break;
            }
            dfs(num.substring(i), num.substring(0, i),
                    target, 0, Long.parseLong(num.substring(0, i)), true, ans) ;
        }
        return ans;
    }

    public void dfs(String s, String trace, int target,
                    long pre, long current, boolean sign, List<String> ans) {
        long sum = sign ? pre + current : pre - current;
        if (s.length() == 0) {
            if (sum == (long) target) {
                ans.add(trace);
            }
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            if (i >= 2 && s.charAt(0) == '0') {
                break;
            }
            int number = Integer.parseInt(s.substring(0, i));
            dfs(s.substring(i), trace + "+" + number,
                    target, sum, number, true, ans);
            dfs(s.substring(i), trace + "-" + number,
                    target, sum, number, false, ans);
            dfs(s.substring(i), trace + "*" + number,
                    target, pre, current * number, sign, ans);
        }
    }
}