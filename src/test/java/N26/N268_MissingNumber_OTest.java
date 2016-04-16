package N26;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wenwen.xww on 2015/11/2.
 */
public class N268_MissingNumber_OTest {
    N268_MissingNumber_O example = new N268_MissingNumber_O();

    @Test
    public void testMissingNumber() throws Exception {
        int[] arr = {0, 1, 3};
        assertEquals(2, example.missingNumber(arr));
    }
}