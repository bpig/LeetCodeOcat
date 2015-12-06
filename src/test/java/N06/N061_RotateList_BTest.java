package N06;

import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */
public class N061_RotateList_BTest {
    N061_RotateList_B nb = new N061_RotateList_B();

    @Test
    public void testRotateRight() throws Exception {
        ListNode ln;
        ListNode expect;
        ListNode ret;

        ln = ListNode.create("1,2,3,4,5");
        expect = ListNode.create("4,5,1,2,3");
        ret = nb.rotateRight(ln, 2);
        assertEquals(expect.toString(), ret.toString());

        ln = ListNode.create("1");
        expect = ListNode.create("1");
        ret = nb.rotateRight(ln, 0);
        assertEquals(expect.toString(), ret.toString());
        ret = nb.rotateRight(ln, 1);
        assertEquals(expect.toString(), ret.toString());

    }
}