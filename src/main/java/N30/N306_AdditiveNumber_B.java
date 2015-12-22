package N30;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-22
 */

/**
 * Additive number is a string whose digits can form additive sequence.
 * <p/>
 * A valid additive sequence should contain at least three numbers.
 * Except for the first two numbers,
 * each subsequent number in the sequence must be the sum of the preceding two.
 * <p/>
 * For example:
 * "112358" is an additive number because the digits can form an additive sequence:
 * 1, 1, 2, 3, 5, 8.
 * <p/>
 * 1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
 * "199100199" is also an additive number, the additive sequence is: 1, 99, 100, 199.
 * 1 + 99 = 100, 99 + 100 = 199
 * Note: Numbers in the additive sequence cannot have leading zeros,
 * so sequence 1, 2, 03 or 1, 02, 3 is invalid.
 * <p/>
 * Given a string containing only digits '0'-'9',
 * write a function to determine if it's an additive number.
 * Follow up:
 * How would you handle overflow for very large input integers?
 * u'(([零|一|二|两|三|四|五|六|七|八|九|十]+((个月)|(岁半)|(周岁)|[天|周|月|岁|年]))+)'
 */
public class N306_AdditiveNumber_B {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();

        for (int i = 1; i <= (n - 1) / 2; i++) {
            // A cannot start with a 0 if its length is more than 1
            if (num.charAt(0) == '0' && i >= 2) {
                continue;
            }

            for (int j = i + 1; n - j >= j - i && n - j >= i; j++) {
                // B cannot start with a 0 if its length is more than 1
                if (num.charAt(i) == '0' && j - i >= 2) {
                    continue;
                }

                long num1 = Long.parseLong(num.substring(0, i)); // A
                long num2 = Long.parseLong(num.substring(i, j)); // B
                String substr = num.substring(j); // remaining string

                if (isAdditive(substr, num1, num2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isAdditive(String str, long num1, long num2) {
        // reaches the end of string means a yes
        if (str.equals("")) {
            return true;
        }

        long sum = num1 + num2;
        String s = ((Long) sum).toString();
        // if string does not start with sum of num1 and num2, returns false
        if (!str.startsWith(s)) {
            return false;
        }
        return isAdditive(str.substring(s.length()), num2, sum);
    }
}
