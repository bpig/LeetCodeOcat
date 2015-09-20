package N02;

import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-20
 */
public class N025_ReverseNodesInKGroup_BTest {
    N025_ReverseNodesInKGroup_B nb = new N025_ReverseNodesInKGroup_B();
    @Test
    public void testReverseKGroup() throws Exception {
        ListNode ln = ListNode.create("1,2,3,4,5");

        ListNode result0 = nb.reverseKGroup(ln, 2);
        String expect0 = new String("2,1,4,3,5");
        assertEquals(expect0, result0.toString());

        ln = ListNode.create("1,2,3,4,5");
        ListNode result1 = nb.reverseKGroup(ln, 3);
        String expect1 = new String("3,2,1,4,5");
        assertEquals(expect1, result1.toString());
    }
}