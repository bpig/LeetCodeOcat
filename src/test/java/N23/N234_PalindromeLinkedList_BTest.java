package N23;

import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-14
 */
public class N234_PalindromeLinkedList_BTest {
    N234_PalindromeLinkedList_B nb = new N234_PalindromeLinkedList_B();
    @Test
    public void testIsPalindrome() throws Exception {
        ListNode ln = ListNode.create("1,2,3,2,1");
        assertTrue(nb.isPalindrome(ln));
    }
}