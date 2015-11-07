package N24;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-07
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string of numbers and operators,
 * return all possible results from computing
 * all the different possible ways to group numbers and operators.
 * The valid operators are +, - and *.
 * <p/>
 * Example 1
 * Input: "2-1-1".
 * <p/>
 * ((2-1)-1) = 0
 * (2-(1-1)) = 2
 * Output: [0, 2]
 * <p/>
 * Example 2
 * Input: "2*3-4*5"
 * <p/>
 * (2*(3-(4*5))) = -34
 * ((2*3)-(4*5)) = -14
 * ((2*(3-4))*5) = -10
 * (2*((3-4)*5)) = -10
 * (((2*3)-4)*5) = 10
 * Output: [-34, -14, -10, -10, 10]
 */
public class N241_DifferentWaysToAddParentheses_B {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> ret = new ArrayList<>();
        if (input == null) {
            return ret;
        }
        for (int i = 0; i < input.length(); ++i) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String a = input.substring(0, i);
                String b = input.substring(i + 1);
                for (int x : diffWaysToCompute(a)) {
                    for (int y : diffWaysToCompute(b)) {
                        if (c == '+') {
                            ret.add(x + y);
                        } else if (c == '-') {
                            ret.add(x - y);
                        } else if (c == '*') {
                            ret.add(x * y);
                        }
                    }
                }
            }
        }
        if (ret.isEmpty()) {
            ret.add(Integer.valueOf(input));
        }
        return ret;
    }
}
