package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-27
 */

import java.util.*;

/**
 * Given a collection of candidate numbers (C) and a target number (T),
 * find all unique combinations in C where the candidate numbers sums to T.
 * <p/>
 * Each number in C may only be used once in the combination.
 * <p/>
 * Note:
 * All numbers (including target) will be positive integers.
 * Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set 10,1,2,7,6,1,5 and target 8,
 * A solution set is:
 * [1, 7]
 * [1, 2, 5]
 * [2, 6]
 * [1, 1, 6]
 */
public class N040_CombinationSumII_B {
    Set<List<Integer>> ret = new HashSet<>();

    void recur(int[] candidates, int next, int target, List<Integer> nums) {
        if (target == 0) {
            ret.add(new ArrayList<>(nums));
        }

        if (next == candidates.length) {
            return;
        }

        int value = candidates[next];
        if (target < value) {
            return;
        }

        nums.add(value);
        recur(candidates, next + 1, target - value, nums);
        nums.remove(nums.size() - 1);

        recur(candidates, next + 1, target, nums);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> nums = new ArrayList<>();
        recur(candidates, 0, target, nums);
        return new ArrayList<>(ret);
    }
}
