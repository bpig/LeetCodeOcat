package N06;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-05
 */

/**
 * Given two binary strings,
 * return their sum (also a binary string).
 * <p/>
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 */
public class N067_AddBinary_B {
    // fast
    public String addBinary(String a, String b) {
        if (a.length() > b.length()) {
            return addBinary(b, a);
        }

        StringBuilder sb = new StringBuilder();
        char carry = '0';
        int hb = b.length();
        int ha = a.length();
        // >= slower than >
        // char fater than int (more substract operator)
        while (hb > 0) {
            char ac = ha > 0 ? a.charAt(ha-- - 1) : '0';
            char bc = b.charAt(hb-- - 1);
            char cur;
            if (ac != bc) {
                cur = carry == '1' ? '0' : '1';
            } else {
                cur = carry;
                carry = ac;
            }
            sb.append(cur);
        }
        if (carry == '1') {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    // some slow
    public String scoreA(String a, String b) {
        int ha = a.length();
        int hb = b.length();
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (Math.max(ha, hb) > 0) {
            int ac = ha > 0 ? (a.charAt(ha-- - 1)) - '0': 0;
            int bc = hb > 0 ? (b.charAt(hb-- - 1)) - '0': 0;
            int sum = ac + bc + carry;
            carry = sum > 1 ? 1 : 0;
            sum = sum % 2;
            sb.append(sum);
        }
        return carry == 1 ? sb.append(1).reverse().toString()
                : sb.reverse().toString();
    }

    public String scoreB(String a, String b) {
        if (a.length() < b.length()) {
            return scoreB(b, a);
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int carry = 0;
        for (; i < b.length(); ++i) {
            int c0 = a.charAt(a.length() - 1 - i) - '0';
            int c1 = b.charAt(b.length() - 1 - i) - '0';
            int sum = c0 + c1 + carry;
            carry = sum >= 2 ? 1 : 0;
            sum = sum % 2;
            sb.append(sum);
        }
        for (; i < a.length(); ++i) {
            if (carry == 0) {
                sb.append(a.charAt(a.length() - 1 - i));
                continue;
            }
            int c0 = a.charAt(a.length() - 1 - i) - '0';
            int sum = c0 + carry;
            carry = sum >= 2 ? 1 : 0;
            sum = sum % 2;
            sb.append(sum);
        }
        if (carry == 1) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
