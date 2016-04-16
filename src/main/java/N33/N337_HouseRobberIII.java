package N33;

import util.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created: shuai.li
 * Date: 2016/4/16.
 */

/**
 * The thief has found himself a new place for his thievery again. There is only one entrance to this area, called the "root." Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that "all houses in this place forms a binary tree". It will automatically contact the police if two directly-linked houses were broken into on the same night.
 * <p>
 * Determine the maximum amount of money the thief can rob tonight without alerting the police.
 * <p>
 * Example 1:
 * `````3
 * ```/ \
 * ``2   3
 * ``\   \
 * ```3   1
 * Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
 * Example 2:
 * `````3
 * ```/ \
 * ``4   5
 * `/ \   \
 * 1   3   1
 * Maximum amount of money the thief can rob = 4 + 5 = 9.
 */
public class N337_HouseRobberIII {
    Map[] content;

    int recur(TreeNode q, int ok) {
        if (q == null) {
            return 0;
        }
        if (content[ok].containsKey(q)) {
            return (int) content[ok].get(q);
        }
        int ans = recur(q.left, 1) + recur(q.right, 1);
        if (ok == 1) {
            ans = Math.max(ans, q.val + recur(q.left, 0) + recur(q.right, 0));
        }
        content[ok].put(q, ans);
        return ans;
    }

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        content = new Map[2];
        content[0] = new HashMap<TreeNode, Integer>();
        content[1] = new HashMap<TreeNode, Integer>();
        return recur(root, 1);
    }
}
