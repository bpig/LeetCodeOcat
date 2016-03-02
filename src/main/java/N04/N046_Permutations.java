package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-01
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Given a collection of numbers, return all possible permutations.
 * <p>
 * For example,
 * [1,2,3] have the following permutations:
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 */
public class N046_Permutations {
    void insert(int[] nums, int idx, List<Integer> cands, List<List<Integer>> ans) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(cands));
            return;
        }
        for (int i = 0; i <= idx; ++i) {
            cands.add(i, nums[idx]);
            insert(nums, idx + 1, cands, ans);
            cands.remove(i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        insert(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
}
