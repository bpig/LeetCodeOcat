package N00; /**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-08
 */

import util.ListNode;

/**
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p/>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */

public class N002_AddTwoNumbers_B {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode stub = new ListNode(0);
        ListNode ptr = stub;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int v1 = 0;
            int v2 = 0;
            if (l1 != null) {
                v1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                v2 = l2.val;
                l2 = l2.next;
            }
            int value = v1 + v2 + carry;
            ListNode ln = new ListNode(value % 10);
            carry = value / 10;
            ptr.next = ln;
            ptr = ln;
        }
        return stub.next;
    }

    public ListNode score0(ListNode l1, ListNode l2) {
        ListNode stub = new ListNode(0);
        ListNode ptr = stub;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val + carry;
            if (val >= 10) {
                carry = 1;
                val -= 10;
            } else {
                carry = 0;
            }
            ListNode ln = new ListNode(val);
            ptr.next = ln;
            ptr = ln;
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode tail = l1 == null ? l2 : l1;
        while (tail != null) {
            int val = tail.val + carry;
            if (val >= 10) {
                carry = 1;
                val -= 10;
            } else {
                carry = 0;
            }
            ListNode ln = new ListNode(val);
            ptr.next = ln;
            ptr = ln;
            tail = tail.next;
        }
        if (carry == 1) {
            ptr.next = new ListNode(1);
        }
        return stub.next;
    }
}
