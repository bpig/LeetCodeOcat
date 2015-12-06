package N09;

import org.junit.Test;
import util.TreeNode;

import static org.junit.Assert.assertEquals;

//import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */
public class N099_RecoverBinarySearchTree_BTest {
    N099_RecoverBinarySearchTree_B nb = new N099_RecoverBinarySearchTree_B();

    @Test
    public void testRecoverTree() throws Exception {
        TreeNode tree;
        TreeNode expect;

        tree = TreeNode.create("2,3,1");
        expect = TreeNode.create("2,1,3");
        nb.recoverTree(tree);
        assertEquals(expect, tree);


        tree = TreeNode.create("6,8,3,1,4,7,9");
        expect = TreeNode.create("6,3,8,1,4,7,9");
        nb.recoverTree(tree);
        assertEquals(expect, tree);
    }
}