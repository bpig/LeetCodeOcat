package N33;


import util.TreeNode;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/4/17
 */
public class N337_HouseRoberIII_O {
    int rob(TreeNode root) {
        int[] res = robCore(root);
        return Math.max(res[0], res[1]);
    }

    private int[] robCore(TreeNode root) {
        int[] res = new int[2];
        if (root == null) {
            res[0] = 0;
            res[1] = 0;
            return res;
        }
        int[] leftRes = robCore(root.left);
        int[] rightRes = robCore(root.right);
        res[1] = root.val + leftRes[0] + rightRes[0];
        res[0] = Math.max(leftRes[0], leftRes[1]) + Math.max(rightRes[0], rightRes[1]);
        return res;
    }
}
