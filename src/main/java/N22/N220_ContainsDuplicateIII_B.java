package N22;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-08
 */

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Given an array of integers,
 * find out whether there are two distinct indices i and j in the array
 * such that the difference between nums[i] and nums[j] is at most t
 * and the difference between i and j is at most k.
 * <p/>
 * https://leetcode.com/discuss/45120/c-using-set-less-10-lines-with-simple-explanation
 */
public class N220_ContainsDuplicateIII_B {
    private int getID(int i, int t) {
        return i >= 0 ? i / t : (i + 1) / t - 1;
    }
    // 75%
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (t < 0 || k == 0) {
            return false;
        }
        ++t;
        Map<Integer, Integer> kv = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (i > k) {
                kv.remove(getID(nums[i - k - 1], t));
            }
            int bucket = getID(nums[i - k - 1], t);
            if (kv.containsKey(bucket)) {
                return true;
            }
            if (kv.containsKey(bucket - 1)
                    && Math.abs(nums[i] - kv.get(bucket - 1)) < t) {
                return true;
            }
            if (kv.containsKey(bucket + 1)
                    && Math.abs(nums[i] - kv.get(bucket + 1)) < t) {
                return true;
            }
            kv.put(bucket, nums[i]);
        }
        return false;
    }
    // 71%
    public boolean scoreAMinus(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }

        TreeSet<Integer> values = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                values.remove(nums[i - k - 1]);
            }
            Integer floor = values.ceiling(nums[i] - t);
            if (floor != null && t >= floor - nums[i]) {
                return true;
            }
            values.add(nums[i]);
        }

        return false;
    }
}
