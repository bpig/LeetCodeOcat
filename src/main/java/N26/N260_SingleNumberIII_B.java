package N26;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-02
 */

/**
 * Given an array of numbers nums,
 * in which exactly two elements appear only once and all the other elements appear exactly twice.
 * Find the two elements that appear only once.
 * <p/>
 * For example:
 * <p/>
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 * <p/>
 * Note:
 * The order of the result is not important. So in the above example, [5, 3] is also correct.
 * Your algorithm should run in linear runtime complexity.
 * Could you implement it using only constant space complexity?
 */
public class N260_SingleNumberIII_B {
    public int[] singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res ^= n;
        }
        int seq = (res & (res - 1)) ^ res;
        int[] ret = new int[2];
        for (int n : nums) {
            if ((n & seq) == 0) {
                ret[0] ^= n;
            } else {
                ret[1] ^= n;
            }
        }
        return ret;
    }
}
