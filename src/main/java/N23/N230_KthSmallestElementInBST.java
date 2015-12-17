package N23;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-17
 */

import util.TreeNode;

/**
 * Given a binary search tree,
 * write a function kthSmallest to find the kth smallest element in it.
 * <p/>
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 * <p/>
 * Follow up:
 * What if the BST is modified (insert/delete operations)
 * often and you need to find the kth smallest frequently?
 * How would you optimize the kthSmallest routine?
 */
public class N230_KthSmallestElementInBST {
    int val;
    int k;

    public int scoreA(TreeNode root, int k) {
        this.k = k;
        recur(root);
        return val;
    }

    void recur(TreeNode root) {
        if (k == 0 || root == null) {
            return;
        }
        recur(root.left);
        k--;
        if (k == 0) {
            val = root.val;
        }
        recur(root.right);
    }

    private int counter;

    private TreeNode kthSmallestNode(TreeNode root, int k) {
        if (root == null) {
            return null;
        }
        TreeNode left = kthSmallestNode(root.left, k);
        if (left != null) {
            return left;
        }
        if (++counter == k) {
            return root;
        }
        return kthSmallestNode(root.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {
        counter = 0;
        return kthSmallestNode(root, k).val;
    }
}
