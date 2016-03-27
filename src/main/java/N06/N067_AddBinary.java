package N06;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-05
 */

/**
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 */
public class N067_AddBinary {
    public String addBinary(String a, String b) {
        if (b.length() > a.length()) {
            return addBinary(b, a);
        }
        char[] ans = new char[a.length() + 1];
        int al = a.length() - 1;
        int bl = b.length() - 1;
        int idx = ans.length - 1;
        char carry = '0';
        while (al >= 0) {
            char n0 = a.charAt(al--);
            char n1 = bl >= 0 ? b.charAt(bl--) : '0';
            if (n0 == n1) {
                ans[idx--] = carry;
                carry = n0;
            } else {
                ans[idx--] = carry == '1' ? '0' : '1';
            }
        }
        if (carry == '1') {
            ans[0] = carry;
            return new String(ans);
        }
        return new String(ans, 1, ans.length - 1);
    }
}
