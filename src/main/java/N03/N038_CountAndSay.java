package N03;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-27
 */

/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * <p>
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 * <p>
 * Note: The sequence of integers will be represented as a string.
 */
public class N038_CountAndSay {
    String transform(String s) {
        StringBuffer sb = new StringBuffer();
        char c = s.charAt(0);
        int len = 1;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == c) {
                len++;
            } else {
                sb.append(len);
                sb.append(c);
                c = s.charAt(i);
                len = 1;
            }
        }
        sb.append(len);
        sb.append(c);
        return sb.toString();
    }

    public String countAndSay(int n) {
        if (n <= 0) {
            return "";
        }
        if (n == 1) {
            return "1";
        }
        String pre = countAndSay(n - 1);
        return transform(pre);
    }
}
