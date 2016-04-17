package N33;

import util.TreeNode;

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
    public int rob(TreeNode root) {
        int[] maxVal = dpRob(root);
        return Math.max(maxVal[0], maxVal[1]);
    }

    public int[] dpRob(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] maxVal = new int[2];
        int[] leftMax = dpRob(root.left);
        int[] rightMax = dpRob(root.right);
        maxVal[0] = Math.max(leftMax[0], leftMax[1]) + Math.max(rightMax[0], rightMax[1]);
        maxVal[1] = leftMax[0] + rightMax[0] + root.val;
        return maxVal;
    }
}
