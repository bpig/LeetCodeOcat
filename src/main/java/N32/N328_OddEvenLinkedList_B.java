package N32;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/4/29
 */

import util.ListNode;

/**
 * Given a singly linked list, group all odd nodes together followed by the even nodes.
 * Please note here we are talking about the node number and not the value in the nodes.
 * <p>
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 * <p>
 * Example:
 * Given 1->2->3->4->5->NULL,
 * return 1->3->5->2->4->NULL.
 * <p>
 * Note:
 * The relative order inside both the even and odd groups should remain as it was in the input.
 * The first node is considered odd, the second node even and so on ...
 */
public class N328_OddEvenLinkedList_B {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode ins = head;
        ListNode cur = head.next;
        while (cur != null && cur.next != null) {
            ListNode pt = cur.next;
            cur.next = pt.next;
            pt.next = ins.next;
            ins.next = pt;
            ins = ins.next;
            cur = cur.next;
        }
        return head;
    }
}
