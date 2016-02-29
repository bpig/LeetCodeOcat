package N03;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-27
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
 * Elements in a combination (a1, a2, ... , ak) must be in non-descending order. (ie, a1 <= a2 <= ... <= ak).
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set 2,3,6,7 and target 7,
 * A solution set is:
 * [7]
 * [2, 2, 3]
 */
public class N039_CombinationSum_B {
    List<List<Integer>> ret;

    void recurMain(int[] candidates, int next, int target, List<Integer> nums) {
        if (target == 0) {
            ret.add(new ArrayList<>(nums));
            return;
        }
        if (next == candidates.length) {
            return;
        }
        int value = candidates[next];
        if (value > target) {
            return;
        }
        nums.add(value);
        recurMain(candidates, next, target - value, nums);
        nums.remove(nums.size() - 1);

        recurMain(candidates, next + 1, target, nums);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ret = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> nums = new ArrayList<>();
        recurMain(candidates, 0, target, nums);
        return ret;
    }


    void recur(int[] candidates, int lo, int target, List<Integer> nums) {
        for (int i = lo; i < candidates.length; ++i) {
            int value = candidates[i];
            if (value > target) {
                break;
            }
            if (value == target) {
                List<Integer> tmp = new ArrayList<>(nums);
                tmp.add(value);
                ret.add(tmp);
                break;
            }
            nums.add(value);
            recur(candidates, i, target - value, nums);
            nums.remove(nums.size() - 1);
        }
    }

    public List<List<Integer>> score1(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> nums = new ArrayList<>();
        recur(candidates, 0, target, nums);
        return ret;
    }
}
