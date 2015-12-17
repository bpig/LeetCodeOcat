package N22;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-17
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array of size n,
 * find all elements that appear more than ⌊ n/3 ⌋ times.
 * The algorithm should run in linear time and in O(1) space.
 * <p/>
 * https://leetcode.com/problems/majority-element-ii/
 * <p/>
 * vote algorithm
 * Majority Vote algroithm, http://www.cs.utexas.edu/~moore/best-ideas/mjrty/index.html.
 */
public class N229_MajorityElementII_B {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ans;
        }
        int count1 = 0;
        int count2 = 0;
        int candidate1 = 0;
        int candidate2 = 1;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1 += 2;
            } else {
                count1--;
            }
            if (num == candidate2) {
                count2 += 2;
            } else {
                count2--;
            }
        }
        if (count1 > 0) {
            ans.add(candidate1);
        }
        if (count2 > 0) {
            ans.add(candidate2);
        }
        return ans;
    }
}
