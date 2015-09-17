package N02;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-16
 */

import util.ListNode;

/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class N021_MergeTwoSortedLists_B {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode stub = new ListNode(0);
        stub.next = l1;
        l1 = stub;
        while (l2 != null) {
            while (l1.next != null && l1.next.val < l2.val) {
                l1 = l1.next;
            }
            ListNode tmp = l1.next;
            l1.next = l2;
            l2 = l2.next;
            l1.next.next = tmp;
        }
        return stub.next;
    }
}
