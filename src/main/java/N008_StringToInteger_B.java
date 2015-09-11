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
        long value = 0;
        int idx = 0;
        boolean neg = false;
        if (str.charAt(0) == '-') {
            neg = true;
            idx = 1;
        }
        for (; idx < str.length(); ++idx) {
            char c = str.charAt(idx);
            if (!Character.isDigit(c)) {
                return 0;
            }
            value = value * 10 + (c - '0');
        }
        value = neg ? -value : value;
        if (value > Integer.MAX_VALUE || value < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)value;
    }
}
