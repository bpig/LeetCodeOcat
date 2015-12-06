package N09;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * <p/>
 * Assume a BST is defined as follows:
 * <p/>
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */
public class N098_ValidateBinarySearchTree_B {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    public boolean isValid(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.val <= min) {
            return false;
        }
        if (max != null && root.val >= max) {
            return false;
        }
        return isValid(root.left, min, root.val)
                && isValid(root.right, root.val, max);
    }

    public boolean scoreB(TreeNode root) {
        List<Integer> lt = new ArrayList<>();
        recur(root, lt);
        int i = 0;
        for (; i < lt.size() - 1; ++i) {
            if (lt.get(i) >= lt.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public void recur(TreeNode root, List<Integer> lt) {
        if (root == null) {
            return;
        }
        recur(root.left, lt);
        lt.add(root.val);
        recur(root.right, lt);
    }
}
