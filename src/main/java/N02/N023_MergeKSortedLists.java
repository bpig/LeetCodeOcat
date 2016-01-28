package N02;

import util.ListNode;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-28
 */
public class N023_MergeKSortedLists {
    ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }

    ListNode partition(ListNode[] lists, int lo, int hi) {
        if (lo == hi) {
            return lists[lo];
        }
        int mid = lo + (hi - lo) / 2;
        ListNode l1 = partition(lists, lo, mid);
        ListNode l2 = partition(lists, mid + 1, hi);
        return merge(l1, l2);
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return partition(lists, 0, lists.length - 1);
    }
}
