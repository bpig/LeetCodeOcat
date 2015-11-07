package N25;

import org.junit.Test;
import util.TreeNode;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-07
 */
public class N257_BinaryTreePaths_BTest {
    N257_BinaryTreePaths_B nb = new N257_BinaryTreePaths_B();

    @Test
    public void testBinaryTreePaths() throws Exception {
        TreeNode root = TreeNode.create("1,2,3,#,5");
        List<String> ret = nb.binaryTreePaths(root);
        List<String> expect = Arrays.asList("1->2->5", "1->3");
        assertEquals(expect, ret);
    }
}