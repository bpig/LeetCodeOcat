package N22;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-19
 */

import util.TreeNode;

/**
 * Invert a binary tree.
 * <p/>
 * `      4
 * `    /   \
 * `  2     7
 * ` / \   / \
 * `1   3 6   9
 * to
 * `     4
 * `   /   \
 * ` 7     2
 * `/ \   / \
 * 9   6 3   1
 * Trivia:
 * This problem was inspired by this original tweet by Max Howell:
 * Google: 90% of our engineers use the software you wrote (Homebrew),
 * but you can’t invert a binary tree on a whiteboard so fuck off.
 */
public class N226_InvertBinaryTree_B {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }
}
