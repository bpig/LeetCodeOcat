package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-22
 */

import java.util.*;

/**
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 * <p/>
 * For example,
 * [1,1,2] have the following unique permutations:
 * [1,1,2], [1,2,1], and [2,1,1].
 * <p/>
 */
public class N047_PermutationsII_B {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> scoreB(int[] nums) {
        permute(0, nums, new ArrayList<>());
        return new ArrayList<>(new HashSet<>(list));
    }

    void permute(int i, int[] nums, List<Integer> col) {
        if (i == nums.length) {
            list.add(new ArrayList<>(col));
            return;
        }
        for (int j = 0; j <= i; ++j) {
            col.add(j, nums[i]);
            permute(i + 1, nums, col);
            col.remove(j);
        }
    }

    /**
     * The idea is to try to put every number at the beginning of the array,
     * and then do the same thing for the rest of the array.
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        permute(list, 0, res);
        return res;
    }

    private void permute(ArrayList<Integer> nums, int start, List<List<Integer>> res) {
        if (start == nums.size() - 1) {
            res.add(new ArrayList<>(nums));
            return;
        }
        for (int i = start; i < nums.size(); i++) {
            if (i > start && nums.get(i) == nums.get(i - 1)) {
                continue;
            }
            nums.add(start, nums.get(i));
            nums.remove(i + 1);
            permute(nums, start + 1, res);
            nums.add(i + 1, nums.get(start));
            nums.remove(start);
        }
    }
}
