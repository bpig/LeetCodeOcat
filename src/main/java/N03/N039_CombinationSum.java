package N03;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-28
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of candidate numbers (C) and a target number (T),
 * find all unique combinations in C where the candidate numbers sums to T.
 * <p>
 * The same repeated number may be chosen from C unlimited number of times.
 * <p>
 * Note:
 * All numbers (including target) will be positive integers.
 * Elements in a combination (a1, a2, ... , ak) must be in non-descending order.
 * (ie, a1 <= a2 <= ... <= ak).
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set 2,3,6,7 and target 7,
 * A solution set is:
 * [7]
 * [2, 2, 3]
 */
public class N039_CombinationSum {
    List<List<Integer>> ret;

    void recur(int[] candidates, List<Integer> nums, int next, int target) {
        if (target == 0) {
            ret.add(new ArrayList<>(nums));
            return;
        }
        if (next == candidates.length) {
            return;
        }
        int value = candidates[next];
        if (target < value) {
            return;
        }
        nums.add(value);
        recur(candidates, nums, next, target - value);
        nums.remove(nums.size() - 1);

        recur(candidates, nums, next + 1, target);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        ret = new ArrayList<>();
        recur(candidates, new ArrayList<>(), 0, target);
        return ret;
    }
}
