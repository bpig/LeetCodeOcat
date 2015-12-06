package N12;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */

import util.TreeNode;

/**
 * Given a binary tree, find the maximum path sum.
 * <p/>
 * For this problem,
 * a path is defined as any sequence of nodes
 * from some starting node to any node in the tree along the parent-child connections.
 * The path does not need to go through the root.
 * <p/>
 * For example:
 * Given the below binary tree,
 * <p/>
 * `  1
 * ` / \
 * `2   3
 * Return 6.
 */
public class N124_BinaryTreeMaximumPathSum_B {
    int ans;

    public int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;
        maxPathSumR(root);
        return ans;
    }

    public int maxPathSumR(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(maxPathSumR(root.left), 0);
        int right = Math.max(maxPathSumR(root.right), 0);
        ans = Math.max(ans, left + right + root.val);

        return Math.max(left, right) + root.val;
    }

    public int scoreB(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxPathSumR(root.left);
        int right = maxPathSumR(root.right);

        int max = Math.max(root.val,
                Math.max(root.val + left, root.val + right));
        ans = Math.max(ans, Math.max(max, left + right + root.val));
        return max;
    }

}
