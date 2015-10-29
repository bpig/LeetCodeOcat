package N27;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wenwen.xww on 2015/10/29.
 */
public class N278_FirstBadVersion_OTest {
    N278_FirstBadVersion_O example = new N278_FirstBadVersion_O(12);
    @Test
    public void testFirstBadVersion() throws Exception {
        assertEquals(4,example.firstBadVersion(12));
    }
}