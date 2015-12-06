package N09;

import org.junit.Test;
import util.TreeNode;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */
public class N098_ValidateBinarySearchTree_BTest {
    N098_ValidateBinarySearchTree_B nb = new N098_ValidateBinarySearchTree_B();

    @Test
    public void testIsValidBST() throws Exception {
        TreeNode tree;
        tree = TreeNode.create("6,3,8,1,4,7,9");
        assertTrue(nb.isValidBST(tree));

        tree = TreeNode.create("1,1,#");
        assertFalse(nb.isValidBST(tree));
    }
}