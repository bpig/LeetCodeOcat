package N02;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-17
 */

import util.ListNode;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p/>
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * <p/>
 * Your algorithm should use only constant space.
 * You may not modify the values in the list, only nodes itself can be changed.
 */
public class N024_SwapNodesInPairs_B {
    public ListNode swapPairs(ListNode head) {
        ListNode stub = new ListNode(0);
        stub.next = head;
        ListNode ptr = stub;
        while (ptr.next != null && ptr.next.next != null) {
            ListNode tmp = ptr.next;
            ptr.next = tmp.next;
            tmp.next = ptr.next.next;
            ptr.next.next = tmp;
            ptr = tmp;
        }
        return stub.next;
    }
}
