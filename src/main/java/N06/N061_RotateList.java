package N06;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */

import util.ListNode;

/**
 * Given a list, rotate the list to the right by k places,
 * where k is non-negative.
 * <p>
 * For example:
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 */

public class N061_RotateList {
    //cycle
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode ptr = head;
        int len = 1;
        while (ptr.next != null) {
            len++;
            ptr = ptr.next;
        }
        ptr.next = head;
        for (int i = 0; i < len - k % len; ++i) {
            ptr = ptr.next;
        }
        head = ptr.next;
        ptr.next = null;
        return head;
    }
}
