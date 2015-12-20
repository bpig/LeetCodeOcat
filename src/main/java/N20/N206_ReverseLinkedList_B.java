package N20;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-20
 */

import util.ListNode;

/**
 * Reverse a singly linked list.
 * Hint:
 * A linked list can be reversed either iteratively or recursively.
 * Could you implement both?
 */
public class N206_ReverseLinkedList_B {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode stub = new ListNode(0);
        stub.next = head;
        while (head.next != null) {
            ListNode tmp = head.next;
            head.next = tmp.next;
            tmp.next = stub.next;
            stub.next = tmp;
        }
        return stub.next;
    }
}
