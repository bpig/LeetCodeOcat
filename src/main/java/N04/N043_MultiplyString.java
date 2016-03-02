package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-29
 */

/**
 * Given two numbers represented as strings,
 * return multiplication of the numbers as a string.
 * <p>
 * Note: The numbers can be arbitrarily large and are non-negative.
 */

public class N043_MultiplyString {
    public String multiply(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();
        int[] num = new int[l1 + l2];
        for (int i = l1 - 1; i >= 0; --i) {
            for (int j = l2 - 1; j >= 0; --j) {
                int value = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                value += num[i + j + 1];
                num[i + j + 1] = value % 10;
                num[i + j] += value / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : num) {
            if (sb.length() > 0 || i > 0) {
                sb.append(i);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
