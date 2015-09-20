package N20;

import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-20
 */
public class N205_ReverseLinkedList_BTest {
    N205_ReverseLinkedList_B nb = new N205_ReverseLinkedList_B();
    @Test
    public void testReverseList() throws Exception {
        ListNode ln = ListNode.create("1,2,3,4");
        String expect = new String("4,3,2,1");
        ListNode result = nb.reverseList(ln);
        assertEquals(expect, result.toString());
    }
}