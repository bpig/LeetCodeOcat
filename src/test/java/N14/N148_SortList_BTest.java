package N14;

import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-09
 */
public class N148_SortList_BTest {
    N148_SortList_B nb = new N148_SortList_B();

    @Test
    public void testSortList() throws Exception {
        ListNode ls = ListNode.create("5,2,8,6");
        ListNode expect = ListNode.create("2,5,6,8");
        assertEquals(expect, nb.sortList(ls));
    }
}