package util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-07
 */
public class TreeNodeTest {

    @Test
    public void testCreate() throws Exception {
        String[] str;
        TreeNode node;
        str = new String[]{
                "1,2,3",
                "1,2,3,#,5",
                "1,#,2,3,4",
                "1,2,#"
        };
        for (int i = 0; i < str.length; ++i) {
            node = TreeNode.create(str[i]);
            assertEquals(str[i], node.toString());
        }
    }
}