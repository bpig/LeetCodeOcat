package N00; /**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-08
 * Time: 09:19
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2.
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 *
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */

public class N001_TwoSum_B {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> kv = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int num = nums[i];
            int pair = target - num;
            if (kv.containsKey(pair)) {
                return new int[]{kv.get(pair), i + 1};
            }
            kv.put(num, i + 1);
        }
        return null;
    }

    public int[] score0(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> kv = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int num = nums[i];
            if (kv.containsKey(num) && num + num == target) {
                result[0] = kv.get(num);
                result[1] = i + 1;
                Arrays.sort(result);
                return result;
            } else {
                kv.put(num, i + 1);
            }
        }
        for (int key : kv.keySet()) {
            int pair = target - key;
            if (kv.containsKey(pair)) {
                result[0] = kv.get(key);
                result[1] = kv.get(pair);
                Arrays.sort(result);
                return result;
            }
        }
        Arrays.sort(result);
        return result;
    }
}
