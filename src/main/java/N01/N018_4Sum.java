package N01;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-14
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers,
 * are there elements a, b, c, and d in S such that a + b + c + d = target?
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
public class N018_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 3; ++i) {
            if (nums[i] << 2 > target) {
                return ans;
            }
            for (int j = n - 1; j > i + 2; --j) {
                if (nums[j] << 2 < target) {
                    break;
                }
                for (int l = i + 1, m = j - 1; l < m; ) {
                    int sum = nums[i] + nums[l] + nums[m] + nums[j];
                    if (sum > target) {
                        while (m - 1 > l && nums[m - 1] == nums[m]) {
                            --m;
                        }
                        --m;
                    } else if (sum < target) {
                        while (l + 1 < m && nums[l + 1] == nums[l]) {
                            ++l;
                        }
                        ++l;
                    } else {
                        ans.add(Arrays.asList(nums[i], nums[l], nums[m], nums[j]));
                        while (m - 1 > l && nums[m - 1] == nums[m]) {
                            --m;
                        }
                        while (l + 1 < m && nums[l + 1] == nums[l]) {
                            ++l;
                        }
                        --m;
                        ++l;
                    }
                }
                while (j - 1 > i + 2 && nums[j - 1] == nums[j]) {
                    --j;
                }
            }
            while (i + 1 < n - 3 && nums[i + 1] == nums[i]) {
                ++i;
            }
        }
        return ans;
    }
}
