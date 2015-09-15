package N01; /**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-14
 */

import util.ListNode;

/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * <p/>
 * For example,
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 */
public class N019_RemoveNthNodeFromEndOfList_B {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode stub = new ListNode(0);
        stub.next = head;
        ListNode p0 = stub;
        while (n > 0) {
            p0 = p0.next;
            n--;
        }
        ListNode p1 = stub;
        while (p0.next != null) {
            p0 = p0.next;
            p1 = p1.next;
        }
        p1.next = p1.next.next;
        return stub.next;
    }
}