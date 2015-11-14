package N23;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-13
 */

import util.TreeNode;

/**
 * Given a binary search tree (BST),
 * find the lowest common ancestor (LCA) of two given nodes in the BST.
 * <p/>
 * According to the definition of LCA on Wikipedia:
 * The lowest common ancestor is defined between two nodes v and w
 * as the lowest node in T that has both v and w as descendants
 * (where we allow a node to be a descendant of itself).
 * <p/>
 * _______6______
 * /              \
 * ___2__          ___8__
 * /      \        /      \
 * 0      4       7       9
 * `     /  \
 * `     3   5
 * For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6.
 * Another example is LCA of nodes 2 and 4 is 2,
 * since a node can be a descendant of itself according to the LCA definition.
 */
public class N235_LowestCommonAncestorOfABinarySearchTree_B {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val < Math.min(p.val, q.val)) {
            return lowestCommonAncestor(root.right, p, q);
        }
        if (root.val > Math.max(p.val, q.val)) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }

    public TreeNode scoreB(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            TreeNode tmp = p;
            p = q;
            q = tmp;
        }
        if (p.val == root.val || q.val == root.val) {
            return root;
        }
        if (p.val < root.val && q.val > root.val) {
            return root;
        }
        if (q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return lowestCommonAncestor(root.right, p, q);
        }
    }
}
