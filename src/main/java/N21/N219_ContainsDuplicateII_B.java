package N21;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-08
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given an array of integers and an integer k,
 * find out whether there are two distinct indices i and j in the array
 * such that nums[i] = nums[j] and the difference between i and j is at most k.
 */
public class N219_ContainsDuplicateII_B {
    class Hashitem {
        public int v;
        public int i;
        public Hashitem next;

        Hashitem(int _v, int _i) {
            v = _v;
            i = _i;
        }

    }
    // 98.8%
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        int hashSize = 1000;
        if (n <= 1) {
            return false;
        }
        Hashitem[] p = new Hashitem[hashSize];
        for (int i = 0; i < n; ++i) {
            int index = nums[i] % hashSize;
            index = index < 0 ? index + hashSize : index;
            if (p[index] == null) {
                p[index] = new Hashitem(nums[i], i);
            } else {
                Hashitem bucket = p[index];
                Hashitem pre;
                do {
                    if (bucket.v == nums[i] && i - bucket.i <= k) {
                        return true;
                    }
                    pre = bucket;
                    bucket = bucket.next;
                } while (bucket != null);
                pre.next = new Hashitem(nums[i], i);
            }
        }
        return false;
    }

    // run 11%

    public boolean scoreA(int[] nums, int k) {
        Map<Integer, Integer> kv = new HashMap<>(1000);
        for (int i = 0; i < nums.length; ++i) {
            if (kv.containsKey(nums[i])
                    && i - kv.get(nums[i]) <= k) {
                return true;
            }
            kv.put(nums[i], i);
        }
        return false;
    }

    // run 85%
    public boolean scoreB(int[] nums, int k) {
        if (nums.length <= 1 || k <= 0) {
            return false;
        }
        if (k >= nums.length) {
            k = nums.length - 1;
        }
        Set<Integer> cols = new HashSet<>();
        for (int i = 0; i < k; ++i) {
            if (!cols.add(nums[i])) {
                return true;
            }
        }
        for (int i = 0, j = k; j < nums.length; ++i, ++j) {
            if (cols.contains(nums[j])) {
                return true;
            }
            cols.remove(nums[i]);
            cols.add(nums[j]);
        }
        return false;
    }
}
