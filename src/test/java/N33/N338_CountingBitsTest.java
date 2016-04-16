package N33;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Administrator on 2016/4/7.
 */
public class N338_CountingBitsTest {
    N338_CountingBits nb = new N338_CountingBits();
    @Test
    public void count() throws Exception {
        assertEquals(3, nb.count(7));
        assertEquals(2, nb.count(6));
        assertEquals(2, nb.count(5));
    }

}