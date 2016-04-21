package N33;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/4/21
 */
public class N331_VerifyPreorderSerializationOfABinaryTree_B {
    public boolean isValidSerialization(String preOrder) {
        String[] strs = preOrder.split(",");
        // root has no indegree, for compensate init with -1
        int degree = -1;
        for (String str : strs) {
            // all nodes have 1 indegree (root compensated)
            degree++;
            // total degree should never exceeds 0
            if (degree > 0) {
                return false;
            }
            // only non-leaf node has 2 outdegree
            if (!str.equals("#")) {
                degree -= 2;
            }
        }
        return degree == 0;
    }
}
