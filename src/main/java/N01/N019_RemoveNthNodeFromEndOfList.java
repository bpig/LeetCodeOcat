package N01;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-14
 */

import util.ListNode;

/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * <p/>
 * For example,
 * <p/>
 * Given linked list: 1->2->3->4->5, and n = 2.
 * <p/>
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 */
public class N019_RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        ListNode tail = dummy;
        while (n > 0) {
            tail = tail.next;
            n--;
        }
        while (tail.next != null) {
            tail = tail.next;
            head = head.next;
        }
        head.next = head.next.next;
        return dummy.next;
    }
}
