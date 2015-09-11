/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-11
 */
public class N008_StringToInteger_B {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        int idx = 0;
        boolean neg = false;
        if (str.charAt(0) == '-') {
            neg = true;
            idx = 1;
        } else if (str.charAt(0) == '+') {
            idx = 1;
        }
        int value = 0;
        for (; idx < str.length(); ++idx) {
            char c = str.charAt(idx);
            if (!Character.isDigit(c)) {
                break;
            }
            int d = c - '0';
            if (value > (Integer.MAX_VALUE - d) / 10) {
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            value = value * 10 + d;
        }
        return neg ? -value : value;
    }
}
