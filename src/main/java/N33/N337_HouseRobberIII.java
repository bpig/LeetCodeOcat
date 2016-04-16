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

    int recur(TreeNode node, int rob) {
        if (node == null) {
            return 0;
        }
        if (content[rob].containsKey(node)) {
            return (int) content[rob].get(node);
        }
        int ans = recur(node.left, 1) + recur(node.right, 1);
        if (rob == 1) {
            ans = Math.max(ans, node.val + recur(node.left, 0) + recur(node.right, 0));
        }
        content[rob].put(node, ans);
        return ans;
    }

    public int rob(TreeNode root) {
        content = new Map[2];
        content[0] = new HashMap<TreeNode, Integer>();
        content[1] = new HashMap<TreeNode, Integer>();
        return recur(root, 1);
    }
}
