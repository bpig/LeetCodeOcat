package N09;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-01
 */

/**
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
 * <p/>
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given an encoded message containing digits, determine the total number of ways to decode it.
 * <p/>
 * For example,
 * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 * <p/>
 * The number of ways decoding "12" is 2.
 */
public class N091_DecodeWays_B {
    public int numDecodings(String s) {
        int n1 = 1;
        int n2 = 1;
        int n3;
        if (s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }
        for (int i = 2; i <= s.length(); i++) {
            n3 = 0;
            if (s.charAt(i - 1) != '0') {
                n3 = n2;
            }
            int num = Integer.parseInt(s.substring(i - 2, i));
            if (num >= 10 && num <= 26) {
                n3 += n1;
            }
            n1 = n2;
            n2 = n3;
        }
        return n2;
    }
}
