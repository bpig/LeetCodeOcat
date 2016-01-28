package N01;

import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-14
 */
public class N019_RemoveNthNodeFromEndOfListTest {
    N019_RemoveNthNodeFromEndOfList nb = new N019_RemoveNthNodeFromEndOfList();

    @Test
    public void testRemoveNthFromEnd() throws Exception {
        ListNode lt = ListNode.create("1,2,3,4,5");
        ListNode expect = ListNode.create("1,2,3,5");
        assertEquals(expect, nb.removeNthFromEnd(lt, 2));
    }
}