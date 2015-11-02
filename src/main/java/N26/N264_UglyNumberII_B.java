package N26;

import java.util.ArrayList;
import java.util.List;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-01
 */

/**
 * Write a program to find the n-th ugly number.
 * <p/>
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 * For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
 * <p/>
 * Note that 1 is typically treated as an ugly number.
 */
public class N264_UglyNumberII_B {
    public int nthUglyNumber(int n) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        int i = 0, j = 0, k = 0;
        while (nums.size() < n) {
            int v = Math.min(Math.min(nums.get(i) * 2, nums.get(j) * 3), nums.get(k) * 5);
            nums.add(v);
            if (v == nums.get(i) * 2) {
                ++i;
            }
            if (v == nums.get(j) * 3) {
                ++j;
            }
            if (v == nums.get(k) * 5) {
                ++k;
            }
        }
        return nums.get(nums.size() - 1);
    }
}
