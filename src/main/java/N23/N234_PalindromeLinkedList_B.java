package N23;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-14
 */

import util.ListNode;

/**
 * Given a singly linked list, determine if it is a palindrome.
 * <p/>
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 */

public class N234_PalindromeLinkedList_B {
    ListNode pt;

    public boolean isPalindrome(ListNode head) {
        pt = head;
        return check(head);
    }

    public boolean check(ListNode p) {
        if (p == null) {
            return true;
        }
        boolean isPal = check(p.next) && pt.val == p.val;
        pt = pt.next;
        return isPal;
    }
}
