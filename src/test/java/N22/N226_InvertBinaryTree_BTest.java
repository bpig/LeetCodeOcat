package N22;

import org.junit.Test;
import util.TreeNode;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-19
 */
public class N226_InvertBinaryTree_BTest {
    N226_InvertBinaryTree_B nb = new N226_InvertBinaryTree_B();

    @Test
    public void testInvertTree() throws Exception {
        TreeNode tn;
        TreeNode expect;
        tn = TreeNode.create("4,2,7,1,3,6,9");
        expect = TreeNode.create("4,7,2,9,6,3,1");
        assertEquals(expect, nb.invertTree(tn));
    }
}