import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-08
 */
public class N002_AddTwoNumbers_BTest {
    N002_AddTwoNumbers_B nb = new N002_AddTwoNumbers_B();
    @Test
    public void test0() {
        ListNode l0 = ListNode.create("2,4,3");
        ListNode l1 = ListNode.create("5,6,4");
        ListNode lr = nb.addTwoNumbers(l0, l1);
        ListNode expect = ListNode.create("7,0,8");
        assertEquals(expect.toString(), lr.toString());
    }
    @Test
    public void test1() {
        ListNode l0 = ListNode.create("1,8");
        ListNode l1 = ListNode.create("0");
        ListNode lr = nb.addTwoNumbers(l0, l1);
        ListNode expect = ListNode.create("1,8");
        assertEquals(expect.toString(), lr.toString());
    }
    @Test
    public void test2() {
        ListNode l0 = ListNode.create("2,4,9");
        ListNode l1 = ListNode.create("5,6");
        ListNode lr = nb.addTwoNumbers(l0, l1);
        ListNode expect = ListNode.create("7,0,0,1");
        assertEquals(expect.toString(), lr.toString());
    }
}