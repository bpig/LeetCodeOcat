package N08;

import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */
public class N082_RemoveDuplicatesFromSortedListII_BTest {
    N082_RemoveDuplicatesFromSortedListII_B nb = new N082_RemoveDuplicatesFromSortedListII_B();

    @Test
    public void testDeleteDuplicates() throws Exception {
        ListNode ln;
        ListNode expect;

        ln = ListNode.create("1,1,1,2,3");
        expect = ListNode.create("2,3");
        assertEquals(expect.toString(), nb.deleteDuplicates(ln).toString());

        ln = ListNode.create("1,2,3,3,4,4,5");
        expect = ListNode.create("1,2,5");
        assertEquals(expect.toString(), nb.deleteDuplicates(ln).toString());

        ln = ListNode.create("1,1");
        assertEquals(null, nb.deleteDuplicates(ln));

        ln = ListNode.create("1,2");
        assertEquals(ln.toString(), nb.deleteDuplicates(ln).toString());
    }
}