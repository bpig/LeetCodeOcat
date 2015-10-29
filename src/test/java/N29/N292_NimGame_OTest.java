package N29;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wenwen.xww on 2015/10/28.
 */
public class N292_NimGame_OTest {
    N292_NimGame_O example = new N292_NimGame_O();

    @Test
    public void testCanWinNim() throws Exception {
        assertTrue(example.canWinNim(2));
        assertFalse(example.canWinNim(4));
    }
}