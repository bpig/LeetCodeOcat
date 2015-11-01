package N26;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wenwen.xww on 2015/11/1.
 */
public class N268_MissingNumberTest {
    N268_MissingNumber example = new N268_MissingNumber();
    @Test
    public void testMissingNumber() throws Exception {
        int[] arr = {0, 1, 3};
        assertEquals(2, example.missingNumber(arr));
    }
}