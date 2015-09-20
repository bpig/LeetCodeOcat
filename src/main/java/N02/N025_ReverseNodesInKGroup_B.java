package N02;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-17
 */

import util.ListNode;

/**
 * Given a linked list,
 * reverse the nodes of a linked list k at a time and return its modified list.
 * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 * You may not alter the values in the nodes, only nodes itself may be changed.
 * Only constant memory is allowed.
 * <p/>
 * For example,
 * Given this linked list: 1->2->3->4->5
 * For k = 2, you should return: 2->1->4->3->5
 * For k = 3, you should return: 3->2->1->4->5
 */
public class N025_ReverseNodesInKGroup_B {
    boolean isValid(ListNode head, int k) {
        while (head != null && k > 0) {
            k--;
            head = head.next;
        }
        return k == 0;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode stub = new ListNode(0);
        stub.next = head;
        ListNode ptr = stub;
        while (isValid(head, k)) {
            for (int i = 1; i < k; ++i) {
                ListNode tmp = head.next;
                head.next = tmp.next;
                tmp.next = ptr.next;
                ptr.next = tmp;
            }
            ptr = head;
            head = head.next;
        }
        return stub.next;
    }
}












