package N06;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-05
 */

/**
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * The digits are stored such that the most significant digit is at the head of the list.
 */
public class N066_PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; --i) {
            digits[i] = digits[i] + 1;
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                return digits;
            }
        }
        int[] ans = new int[len + 1];
        ans[0] = 1;
        return ans;
    }
}
