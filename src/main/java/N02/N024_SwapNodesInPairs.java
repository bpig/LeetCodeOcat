package N02;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-28
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
public class N024_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while (head.next != null && head.next.next != null) {
            ListNode l2 = head.next;
            ListNode l1 = l2.next;
            ListNode tail = l1.next;
            head.next = l1;
            l1.next = l2;
            l2.next = tail;
            head = l2;
        }
        return dummy.next;
    }
}
