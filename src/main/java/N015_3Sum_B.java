/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-12
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * <p/>
 * Note:
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
 * The solution set must not contain duplicate triplets.
 * For example, given array S = {-1 0 1 2 -1 -4},
 * <p/>
 * A solution set is:
 * (-1, 0, 1)
 * (-1, -1, 2)
 */
public class N015_3Sum_B {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; ++i) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[low] + nums[high] + nums[i];
                if (sum < 0) {
                    ++low;
                } else if (sum > 0) {
                    --high;
                } else {
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[low], nums[high])));
                    while (low < high) {
                        if (nums[low] == nums[low + 1]) {
                            low++;
                        } else if (nums[high] == nums[high - 1]) {
                            high--;
                        } else {
                            break;
                        }
                    }
                    ++low;
                    --high;
                }
            }
            while (i + 1 < nums.length - 2 && nums[i] == nums[i + 1]) {
                ++i;
            }
        }
        return result;
    }
}
