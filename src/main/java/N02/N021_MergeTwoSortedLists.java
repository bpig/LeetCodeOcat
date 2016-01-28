package N02;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-28
 */

import util.ListNode;

/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class N021_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode ptr = dummy;
        while (l1 != null || l2 != null) {
            int i1 = l1 != null ? l1.val : Integer.MAX_VALUE;
            int i2 = l2 != null ? l2.val : Integer.MAX_VALUE;
            if (i1 <= i2) {
                ptr.next = l1;
                l1 = l1.next;
            } else {
                ptr.next = l2;
                l2 = l2.next;
            }
            ptr = ptr.next;
        }
        return dummy.next;
    }

    public ListNode mergeTwoListsSwitch(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        dummy.next = l1;
        l1 = dummy;
        while (l2 != null) {
            while (l1.next != null && l1.next.val <= l2.val) {
                l1 = l1.next;
            }
            ListNode tmp = l1.next;
            l1.next = l2;
            l1 = l1.next;
            l2 = tmp;
        }
        return dummy.next;
    }

    public ListNode mergeTwoListsRecur(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeTwoListsRecur(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoListsRecur(l1, l2.next);
            return l2;
        }
    }
}
