package N33;

import org.junit.Test;
import util.TreeNode;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/4/16
 */
public class N337_HouseRobberIIITest {
    N337_HouseRobberIII nb = new N337_HouseRobberIII();

    @Test
    public void rob() throws Exception {
        TreeNode root;

        root = TreeNode.create("2,1,3,#,4");
        assertEquals(7, nb.rob(root));

        root = TreeNode.create("3,4,5,1,3,#,1");
        assertEquals(9, nb.rob(root));

        root = TreeNode.create("3,2,3,#,3,#,1");
        assertEquals(7, nb.rob(root));
    }

}