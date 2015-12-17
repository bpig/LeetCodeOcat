package N15;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-09
 */

import java.util.Stack;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * <p/>
 * Valid operators are +, -, *, /.
 * Each operand may be an integer or another expression.
 * <p/>
 * Some examples:
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
public class N150_EvaluateReversePolishNotation_B {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+":
                    st.add(st.pop() + st.pop());
                    break;
                case "-":
                    st.add(-st.pop() + st.pop());
                    break;
                case "/":
                    int a = st.pop();
                    int b = st.pop();
                    st.add(b / a);
                    break;
                case "*":
                    st.add(st.pop() * st.pop());
                    break;
                default:
                    st.add(Integer.valueOf(token));
                    break;
            }
        }
        return st.pop();
    }

}
