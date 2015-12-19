package N22;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-19
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted integer array without duplicates,
 * return the summary of its ranges.
 * <p/>
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 */
public class N228_SummaryRanges_B {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int lo = 0;
        int hi = 1;
        while (hi <= nums.length) {
            if (hi == nums.length || nums[hi] > nums[hi - 1] + 1) {
                ans.add(Integer.toString(nums[lo])
                        + (lo == hi - 1 ? "" : "->" + Integer.toString(nums[hi - 1])));
                lo = hi;
            }
            hi++;
        }
        return ans;
    }
}
