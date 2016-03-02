package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-01
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 * <p>
 * For example,
 * [1,1,2] have the following unique permutations:
 * [1,1,2], [1,2,1], and [2,1,1].
 */

public class N047_PermutationsII {
    private void permute(List<Integer> nums, int start, List<List<Integer>> ans) {
        if (start == nums.size() - 1) {
            ans.add(new ArrayList<>(nums));
            return;
        }
        for (int i = start; i < nums.size(); ++i) {
            if (i > start && nums.get(i - 1) == nums.get(i)) {
                continue;
            }
            nums.add(start, nums.get(i));
            nums.remove(i + 1);
            permute(nums, start + 1, ans);
            nums.add(i + 1, nums.get(start));
            nums.remove(start);
        }
    }

    /**
     * The idea is to try to put every number at the beginning of the array,
     * and then do the same thing for the rest of the array.
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> select = new ArrayList<>();
        for (int num : nums) {
            select.add(num);
        }
        permute(select, 0, ans);
        return ans;
    }
}
