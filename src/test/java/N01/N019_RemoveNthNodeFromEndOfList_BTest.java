package N01;

import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-14
 */
public class N019_RemoveNthNodeFromEndOfList_BTest {
    N019_RemoveNthNodeFromEndOfList_B nb = new N019_RemoveNthNodeFromEndOfList_B();

    @Test
    public void test() {
        assertEquals("1,3", nb.removeNthFromEnd(ListNode.create("1,2,3"), 2).toString());
    }
}