package N26;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wenwen.xww on 2015/11/4.
 */
public class N260_SingleNumber3_OTest {
    N260_SingleNumber3_O example = new N260_SingleNumber3_O();
    @Test
    public void testSingleNumber() throws Exception {
        int[] arr = {1, 2, 1, 3, 2, 5};
        assertEquals(5,example.singleNumber(arr)[0]);
        assertEquals(3,example.singleNumber(arr)[1]);
    }
}