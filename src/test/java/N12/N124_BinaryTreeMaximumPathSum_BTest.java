package N12;

import org.junit.Test;
import util.TreeNode;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */
public class N124_BinaryTreeMaximumPathSum_BTest {
    N124_BinaryTreeMaximumPathSum_B nb = new N124_BinaryTreeMaximumPathSum_B();

    @Test
    public void testMaxPathSum() throws Exception {
        TreeNode tree;
        tree = TreeNode.create("1,2,3");
        assertEquals(6, nb.maxPathSum(tree));

        tree = TreeNode.create("2,-1,#");
        assertEquals(2, nb.maxPathSum(tree));
    }
}