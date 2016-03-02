package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-29
 */

import java.util.*;

/**
 * Given a collection of candidate numbers (C) and a target number (T),
 * find all unique combinations in C where the candidate numbers sums to T.
 * <p>
 * Each number in C may only be used once in the combination.
 * <p>
 * Note:
 * All numbers (including target) will be positive integers.
 * Elements in a combination (a1, a2, ... , ak) must be in non-descending order. (ie, a1 <+ a2 <= ... <= ak).
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set 10,1,2,7,6,1,5 and target 8,
 * A solution set is:
 * [1, 7]
 * [1, 2, 5]
 * [2, 6]
 * [1, 1, 6]
 */
public class N040_CombinationSumII {
    List<List<Integer>> ans;

    void recur(int[] candidates, int next, int target, int[] nums, int idx) {
        if (target == 0) {
            List<Integer> one = new ArrayList<>();
            for (int i = 0; i < idx; ++i) {
                one.add(nums[i]);
            }
            ans.add(one);
            return;
        }
        int pre = 0;
        for (int i = next; i < candidates.length; ++i) {
            if (candidates[i] != pre) {
                if (target < candidates[i]) {
                    break;
                }
                nums[idx] = candidates[i];
                recur(candidates, i + 1, target - candidates[i], nums, idx + 1);
                pre = candidates[i];
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList<>();
        Arrays.sort(candidates);
        recur(candidates, 0, target, new int[candidates.length], 0);
        return new ArrayList<>(ans);
    }

}
