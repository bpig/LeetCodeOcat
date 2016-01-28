package N16;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-14
 */

/**
 * Given an unsorted array,
 * find the maximum difference between the successive elements in its sorted form.
 * <p/>
 * Try to solve it in linear time/space.
 * <p/>
 * Return 0 if the array contains less than 2 elements.
 * <p/>
 * You may assume all elements in the array are non-negative integers
 * and fit in the 32-bit signed integer range.
 * <p/>
 * https://leetcode.com/problems/maximum-gap/
 */
public class N164_MaximumGap_B {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }

        // m is the maximal number in nums
        int m = nums[0];
        for (int i = 1; i < nums.length; i++) {
            m = Math.max(m, nums[i]);
        }

        int exp = 1; // 1, 10, 100, 1000 ...
        int R = 10; // 10 digits

        int[] aux = new int[nums.length];

        while (m / exp > 0) { // Go through all digits from LSB to MSB
            int[] count = new int[R];

            for (int i = 0; i < nums.length; i++) {
                count[(nums[i] / exp) % 10]++;
            }

            for (int i = 1; i < count.length; i++) {
                count[i] += count[i - 1];
            }

            for (int i = nums.length - 1; i >= 0; i--) {
                aux[--count[(nums[i] / exp) % 10]] = nums[i];
            }

            for (int i = 0; i < nums.length; i++) {
                nums[i] = aux[i];
            }
            exp *= 10;
        }

        int max = 0;
        for (int i = 1; i < aux.length; i++) {
            max = Math.max(max, aux[i] - aux[i - 1]);
        }

        return max;
    }
}
