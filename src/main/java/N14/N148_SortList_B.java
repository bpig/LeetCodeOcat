package N14;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-09
 */

import util.ListNode;

/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 */
public class N148_SortList_B {
    /*
     A small trick used in the following code is that,
     in order to sort the following sublist of length 4, e.g.
     Start -> 5 -> 6 -> 2 -> 8 ->Tail (assume list is already sorted under length 2)
     I break the sublist into 3 parts:
     1) Start -> Tail
     2) 5 -> 6 -> Null
     3) 2 -> 8 -> Null
     And then try to insert nodes from sublists 2) and 3) into 1).
     */
    // impossible.........
    public ListNode sortListIter(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        for (ListNode current = head; current != null; current = current.next) {
            length++;
        }
        for (int len = 2; len / 2 <= length; len *= 2) {
            ListNode start = dummy, mid = dummy, end = dummy;
            while (start.next != null) {
                for (int i = 0; i < len / 2; i++) {
                    mid = mid.next == null ? mid : mid.next;
                    if (end.next == null) {
                        continue;
                    }
                    end = end.next.next == null ? end.next : end.next.next;
                }
                ListNode left = start.next, right = mid.next;
                start.next = end.next;
                mid.next = null;
                end.next = null;
                while (left != null || right != null) {
                    if (right == null || left != null && left.val < right.val) {
                        ListNode temp = left.next;
                        left.next = start.next;
                        start.next = left;
                        left = temp;
                    } else if (left == null || left.val >= right.val) {
                        ListNode temp = right.next;
                        right.next = start.next;
                        start.next = right;
                        right = temp;
                    }
                    start = start.next;
                }
                mid = start;
                end = start;
            }
        }
        return dummy.next;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        ListNode a = sortList(mid);
        ListNode b = sortList(head);
        return merge(a, b);
    }

    public ListNode merge(ListNode a, ListNode b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        if (a.val > b.val) {
            b.next = merge(a, b.next);
            return b;
        } else {
            a.next = merge(a.next, b);
            return a;
        }
    }

}
