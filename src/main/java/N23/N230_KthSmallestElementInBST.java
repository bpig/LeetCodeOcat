package N23;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-17
 */

import util.TreeNode;

import java.util.Stack;

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
    public int kthSmallestNoRec(TreeNode root, int k) {
        Stack<TreeNode> stk = new Stack<>();
        int ct = 0;
        do {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            if (++ct == k) {
                return root.val;
            }
            root = root.right;
        } while (true);
    }

    int val;
    int k;

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        recur(root);
        return val;
    }

    void recur(TreeNode root) {
        if (k <= 0 || root == null) {
            return;
        }
        recur(root.left);
        k--;
        if (k == 0) {
            val = root.val;
        }
        recur(root.right);
    }
}
