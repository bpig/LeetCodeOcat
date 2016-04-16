package N08;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/3/27
 */

import util.ListNode;

/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 * <p>
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 */
public class N082_RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode ptr = head.next;
        if (ptr.val != head.val) {
            head.next = deleteDuplicates(ptr);
            return head;
        }
        while (ptr != null && ptr.val == head.val) {
            ptr = ptr.next;
        }
        return deleteDuplicates(ptr);
    }
}
