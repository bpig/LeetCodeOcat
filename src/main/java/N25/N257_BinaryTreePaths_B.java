package N25;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-07
 */


import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, return all root-to-leaf paths.
 * <p/>
 * For example, given the following binary tree:
 * <p/>
 * 1
 * / \
 * 2  3
 * \
 * 5
 * All root-to-leaf paths are:
 * <p/>
 * ["1->2->5", "1->3"]
 */
public class N257_BinaryTreePaths_B {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        if (root.left == null && root.right == null) {
            list.add("" + root.val);
            return list;
        }
        for (String str : binaryTreePaths(root.left)) {
            list.add(root.val + "->" + str);
        }
        for (String str : binaryTreePaths(root.right)) {
            list.add(root.val + "->" + str);
        }
        return list;
    }

    public List<String> scoreNormal(TreeNode root) {
        List<String> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Queue<String> strs = new LinkedList<>();
        Queue<TreeNode> nodes = new LinkedList<>();

        nodes.add(root);
        strs.add(Integer.toString(root.val));
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.poll();
            String str = strs.poll();
            if (node.left == null && node.right == null) {
                ret.add(str);
                continue;
            }
            if (node.left != null) {
                nodes.add(node.left);
                strs.add(str + "->" + Integer.toString(node.left.val));
            }
            if (node.right != null) {
                nodes.add(node.right);
                strs.add(str + "->" + Integer.toString(node.right.val));
            }
        }
        return ret;
    }
}
