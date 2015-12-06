package N08;

import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */
public class N083_RemoveDuplicatesFromSortedList_BTest {
    N083_RemoveDuplicatesFromSortedList_B nb = new N083_RemoveDuplicatesFromSortedList_B();
    @Test
    public void testDeleteDuplicates() throws Exception {
        ListNode ln = ListNode.create("1,1,2,3,3");
        ListNode expect = ListNode.create("1,2,3");
        assertEquals(expect.toString(), nb.deleteDuplicates(ln).toString());
    }
}