package N02;

import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-28
 */
public class N025_ReverseNodesInKGroupTest {
    N025_ReverseNodesInKGroup nb = new N025_ReverseNodesInKGroup();

    @Test
    public void testReverseKGroup() throws Exception {
        ListNode data;
        ListNode expect;

        data = ListNode.create("1,2,3,4,5");
        expect = ListNode.create("2,1,4,3,5");
        assertEquals(expect, nb.reverseKGroup(data, 2));

        data = ListNode.create("1,2,3,4,5");
        expect = ListNode.create("3,2,1,4,5");
        assertEquals(expect, nb.reverseKGroup(data, 3));
    }
}