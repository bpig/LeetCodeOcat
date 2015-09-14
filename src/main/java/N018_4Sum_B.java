/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-14
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c, and d
 * in S such that a + b + c + d = target?
 * Find all unique quadruplets in the array which gives the sum of target.
 * <p/>
 * Note:
 * Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
 * The solution set must not contain duplicate quadruplets.
 * For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
 * <p/>
 * A solution set is:
 * (-1,  0, 0, 1)
 * (-2, -1, 1, 2)
 * (-2,  0, 0, 2)
 */
public class N018_4Sum_B {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> cols = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; ++i) {
            for (int j = nums.length - 1; j > i + 2; --j) {
                int low = i + 1;
                int high = j - 1;
                while (low < high) {
                    int sum = nums[i] + nums[j] + nums[low] + nums[high];
                    if (sum == target) {
                        cols.add(Arrays.asList(nums[i], nums[low], nums[high], nums[j]));
                        do {
                            ++low;
                        } while (low < high && nums[low] == nums[low - 1]);
                        do {
                            --high;
                        } while (low < high && nums[high] == nums[high + 1]);
                    } else if (sum < target) {
                        do {
                            ++low;
                        } while (low < high && nums[low] == nums[low - 1]);
                    } else {
                        do {
                            --high;
                        } while (low < high && nums[high] == nums[high + 1]);
                    }
                }
                while (j - 1 > i + 2 && nums[j] == nums[j - 1]) {
                    --j;
                }
            }
            while (i + 1 < nums.length - 3 && nums[i] == nums[i + 1]) {
                ++i;
            }
        }
        return cols;
    }
}
