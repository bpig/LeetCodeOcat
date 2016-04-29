package N32;

import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/4/29
 */
public class N328_OddEvenLinkedList_BTest {
    N328_OddEvenLinkedList_B nb = new N328_OddEvenLinkedList_B();

    @Test
    public void oddEvenList() throws Exception {
        ListNode ln = ListNode.create("1,2,3,4,5");
        ln = nb.oddEvenList(ln);
        assertEquals("1,3,5,2,4", ln.toString());
    }

}