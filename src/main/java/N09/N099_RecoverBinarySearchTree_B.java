package N09;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */

import util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Two elements of a binary search tree (BST) are swapped by mistake.
 * <p/>
 * Recover the tree without changing its structure.
 * <p/>
 * Note:
 * A solution using O(n) space is pretty straight forward.
 * Could you devise a constant space solution?
 * <p/>
 * The basic idea is to use stack to do in-order traversal.
 * In the processing of traversal,
 * keep comparing the current value with the previous value.
 * Since each previous value should be less than the current value,
 * once an exception is found,
 * record the previous node as the First Mistaken Node and the current node as Second.
 * If one more exceptions are found,
 * override the current node to the Second Mistaken Node.
 * Because if a series of mistaken nodes are found,
 * the only possible way to correct them with one swap is
 * to switch the head and tail node.
 */
public class N099_RecoverBinarySearchTree_B {
    TreeNode first = null;
    TreeNode second = null;
    TreeNode pre = null;

    public void recoverTreeA(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root);
        if (first == null) {
            return;
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    public void dfs(TreeNode root) {
        if (root.left != null) {
            dfs(root.left);
        }
        if (pre != null && pre.val > root.val) {
            if (first == null) {
                first = pre;
            }
            second = root;
        }
        pre = root;
        if (root.right != null) {
            dfs(root.right);
        }
    }

    public void recoverTree(TreeNode root) {
        TreeNode first = null;
        TreeNode second = null;
        TreeNode pre = null;
        while (root != null) {
            if (root.left != null) {
                TreeNode p = root.left;
                while (p.right != null && p.right != root) {
                    p = p.right;
                }
                if (p.right == null) {
                    p.right = root;
                    root = root.left;
                    continue;
                } else {
                    p.right = null;
                }
            }
            if (pre != null && root.val < pre.val) {
                if (first == null) {
                    first = pre;
                }
                second = root;
            }
            pre = root;
            root = root.right;
        }
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;
    }

    public void scoreB(TreeNode root) {
        TreeNode pre = null;
        TreeNode first = null;
        TreeNode second = null;
        Deque<TreeNode> stack = new LinkedList<>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            if (pre != null && pre.val > temp.val) {
                if (first == null) {
                    first = pre;
                }
                second = temp;
            }
            pre = temp;
            if (temp.right != null) {
                temp = temp.right;
                while (temp != null) {
                    stack.push(temp);
                    temp = temp.left;
                }
            }
        }

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}
