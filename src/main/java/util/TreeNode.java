package util;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-07
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    @Override
    public boolean equals(Object obj) {
        return toString().equals(obj.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(val);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(left);
        queue.add(right);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                sb.append(",#");
                continue;
            }
            sb.append(",");
            sb.append(node.val);
            queue.add(node.left);
            queue.add(node.right);
        }
        String key = ",#,#";
        while (sb.lastIndexOf(key) == sb.length() - 4) {
            sb.delete(sb.length() - 4, sb.length());
        }
        return sb.toString();
    }

    // 1,2,3,#,5
    public static TreeNode create(String str) {
        String[] items = str.split(",");
        TreeNode[] nodes = new TreeNode[items.length];
        for (int i = 0; i < items.length; ++i) {
            if (!items[i].equals("#")) {
                nodes[i] = new TreeNode(Integer.valueOf(items[i]));
            }
        }
        int idx = 1;
        for (int i = 0; i < nodes.length; ++i) {
            if (idx >= nodes.length) {
                break;
            }
            if (nodes[i] == null) {
                continue;
            }
            nodes[i].left = nodes[idx++];
            if (idx >= nodes.length) {
                break;
            }
            nodes[i].right = nodes[idx++];
        }
        return nodes[0];
    }
}
