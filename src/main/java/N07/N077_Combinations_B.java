package N07;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Given two integers n and k,
 * return all possible combinations of k numbers out of 1 ... n.
 * <p/>
 * For example,
 * If n = 4 and k = 2, a solution is:
 * <p/>
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 * <p/>
 * https://leetcode.com/discuss/37021/1-liner-3-liner-4-liner
 * https://leetcode.com/discuss/33887/14ms-c-using-bit-manipulation
 */
public class N077_Combinations_B {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> group = new ArrayList<>();
        recur(n, 1, k, group, ans);
        return ans;
    }

    public void recur(int n, int s, int k, List<Integer> group, List<List<Integer>> ans) {
        if (k == 0) {
            ans.add(new ArrayList<>(group));
            return;
        }
        for (int i = s; i <= n; ++i) {
            group.add(i);
            recur(n, i + 1, k - 1, group, ans);
            group.remove(group.size() - 1);
        }
    }
}
