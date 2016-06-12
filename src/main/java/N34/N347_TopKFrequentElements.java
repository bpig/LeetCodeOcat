package N34;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/6/5
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Given a non-empty array of integers, return the k most frequent elements.
 * <p>
 * For example,
 * Given [1,1,1,2,2,3] and k = 2, return [1,2].
 * <p>
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
public class N347_TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> h = new HashMap();
        for (int i : nums) {
            if (h.containsKey(i)) {
                h.put(i, h.get(i) + 1);
            } else {
                h.put(i, 1);
            }
        }

        List<Integer>[] fc = new ArrayList[n + 1];
        for (int i : h.keySet()) {
            int f = h.get(i);       //System.out.println(f + " times of " + i);
            if (fc[f] == null) {
                fc[f] = new ArrayList();
            }
            fc[f].add(i);
        }


        List<Integer> ans = new ArrayList();
        for (int i = n; i >= 0 && k > 0; --i) {
            if (fc[i] == null) {
                continue;
            }
            for (int j = 0; j < fc[i].size(); ++j) {
                ans.add(fc[i].get(j));
                if (--k == 0) {
                    break;
                }
            }
        }
        return ans;
        /*
        int i = n;
        int j = 0;
        for (; k > 0; k--) {
            for (; fc[i] == null || j == fc[i].size(); j = 0, i--) ;
            ans.add(fc[i].get(j++));
        }
*/

    }
}
