/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-08
 * Time: 09:19
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2.
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */

public class N001_TwoSum_B {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> kv = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            kv.put(nums[i], i + 1);
        }
        int[] result = new int[] {1,3};
        return result;
    }
}
