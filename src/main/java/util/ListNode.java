package util;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-08
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode create(String str) {
        String[] items = str.split(",");
        ListNode stub = new ListNode(0);
        ListNode ptr = stub;
        for (String value : items) {
            ListNode ln = new ListNode(Integer.valueOf(value));
            ptr.next = ln;
            ptr = ln;
        }
        return stub.next;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        ListNode ln = this;
        while (ln != null) {
            str.append(ln.val).append(",");
            ln = ln.next;
        }
        str.deleteCharAt(str.length() - 1);
        return str.toString();
    }

}
