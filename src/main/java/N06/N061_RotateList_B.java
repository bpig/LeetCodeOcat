package N06;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */

import util.ListNode;

/**
 * Given a list, rotate the list to the right by k places,
 * where k is non-negative.
 * <p/>
 * For example:
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 */
public class N061_RotateList_B {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode dummy = head;
        int len = 1;
        while (dummy.next != null) {
            len++;
            dummy = dummy.next;
        }
        dummy.next = head;
        for (int i = 0; i < len - k % len; ++i) {
            dummy = dummy.next;
        }
        head = dummy.next;
        dummy.next = null;
        return head;
    }
    public ListNode scoreB(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        if (len == 0 || k == 0) {
            return dummy.next;
        }
        k %= len;
        len -= k;
        if (len == 0 || k == 0) {
            return dummy.next;
        }
        head = dummy;
        while (len > 0) {
            head = head.next;
            len--;
        }
        ListNode node = head.next;
        head.next = null;
        head = node;
        while (node.next != null) {
            node = node.next;
        }
        node.next = dummy.next;
        return head;
    }
}
