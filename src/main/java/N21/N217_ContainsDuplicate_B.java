package N21;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-08
 */

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers,
 * find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class N217_ContainsDuplicate_B {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
        }
        return false;
    }
}
