package N08;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */

import util.ListNode;

/**
 * Given a sorted linked list,
 * delete all duplicates such that each element appear only once.
 * <p/>
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
public class N083_RemoveDuplicatesFromSortedList_B {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode p0 = head;
        ListNode p1 = head.next;
        while (p1 != null) {
            if (p1.val == p0.val) {
                p0.next = p1.next;
            } else {
                p0 = p1;
            }
            p1 = p0.next;
        }
        return head;
    }
}
