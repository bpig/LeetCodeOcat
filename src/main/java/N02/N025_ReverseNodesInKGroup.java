package N02;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-28
 */

import util.ListNode;

/**
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 * <p/>
 * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 * <p/>
 * You may not alter the values in the nodes, only nodes itself may be changed.
 * <p/>
 * Only constant memory is allowed.
 * <p/>
 * For example,
 * Given this linked list: 1->2->3->4->5
 * <p/>
 * For k = 2, you should return: 2->1->4->3->5
 * <p/>
 * For k = 3, you should return: 3->2->1->4->5
 */
public class N025_ReverseNodesInKGroup {
    boolean isValid(ListNode stub, int k) {
        for (int i = 0; i < k; ++i) {
            stub = stub.next;
            if (stub == null) {
                return false;
            }
        }
        return true;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ptr = dummy;
        while (isValid(ptr, k)) {
            for (int i = 1; i < k; ++i) {
                ListNode insrt = head.next;
                head.next = insrt.next;
                insrt.next = ptr.next;
                ptr.next = insrt;
            }
            ptr = head;
            head = head.next;
        }
        return dummy.next;
    }
}
