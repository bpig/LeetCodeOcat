package N08;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */

import util.ListNode;

/**
 * Given a sorted linked list,
 * delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 * <p/>
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 */
public class N082_RemoveDuplicatesFromSortedListII_B {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int val = head.val;
        ListNode p = head.next;

        if (p.val != val) {
            head.next = deleteDuplicates(p);
            return head;
        }
        while (p != null && p.val == val) {
            p = p.next;
        }
        return deleteDuplicates(p);
    }

    public ListNode scoreAMinus(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p0 = dummy;
        ListNode p1 = head;
        ListNode p2 = head.next;
        boolean reserved = true;
        while (p2 != null) {
            if (p1.val == p2.val) {
                reserved = false;
                p1.next = p2.next;
            } else {
                if (reserved) {
                    p0.next = p1;
                    p0 = p0.next;
                } else {
                    p0.next = p1.next;
                }
                p1 = p2;
                reserved = true;
            }
            p2 = p1.next;
        }
        if (!reserved) {
            p0.next = p1.next;
        }
        return dummy.next;
    }
}
