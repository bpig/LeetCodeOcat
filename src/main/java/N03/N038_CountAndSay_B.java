package N03;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-27
 */

/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * <p/>
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 * <p/>
 * Note: The sequence of integers will be represented as a string.
 */
public class N038_CountAndSay_B {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String value = countAndSay(n - 1);
        StringBuilder builder = new StringBuilder();
        int count = 1;
        for (int i = 1; i < value.length(); ++i) {
            if (value.charAt(i) == value.charAt(i - 1)) {
                count++;
            } else {
                builder.append((char)(count+'0'));
                builder.append(value.charAt(i-1));
                count = 1;
            }
        }
        builder.append((char)(count+'0'));
        builder.append(value.charAt(value.length() - 1));
        return builder.toString();
    }
}
