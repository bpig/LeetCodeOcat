package N23;

import org.junit.Test;
import util.TreeNode;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-17
 */
public class N230_KthSmallestElementInBSTTest {
    N230_KthSmallestElementInBST nb = new N230_KthSmallestElementInBST();

    @Test
    public void testKthSmallest() throws Exception {
        TreeNode tn;
        tn = TreeNode.create("5,3,7");
        assertEquals(3, nb.kthSmallest(tn, 1));
        assertEquals(5, nb.kthSmallest(tn, 2));
        assertEquals(7, nb.kthSmallest(tn, 3));

        nb.post(tn);
    }
}