package N22;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-19
 */

import util.TreeNode;

/**
 * Given a complete binary tree, count the number of nodes.
 * <p/>
 * Definition of a complete binary tree from Wikipedia:
 * In a complete binary tree every level,
 * except possibly the last,
 * is completely filled,
 * and all nodes in the last level are as far left as possible.
 * It can have between 1 and 2h nodes inclusive at the last level h.
 * <p/>
 * https://leetcode.com/problems/count-complete-tree-nodes/
 */
public class N222_CountCompleteTreeNodes_B {
    // faster, 92.8%
    int getTreeHight(TreeNode root) {
        int h = 0;
        while (root != null) {
            h++;
            root = root.left;
        }
        return h;
    }

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = getTreeHight(root.left);
        int rh = getTreeHight(root.right);
        if (lh == rh) {
            /*1(根节点) + (1<<lh)-1(完全左子树) + # of rightNode */
            return (1 << lh) + countNodes(root.right);
        } else {
            /*1(根节点) + (1<<rh)-1(完全右子树) + # of leftNode*/
            return (1 << rh) + countNodes(root.left);
        }
    }

    public int scoreC(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + scoreC(root.left) + scoreC(root.right);
    }
}
