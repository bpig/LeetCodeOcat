package N27;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-10-04
 */
public class N274_HIndex_BTest {
    N274_HIndex_B nb = new N274_HIndex_B();
    @Test
    public void testStod() throws Exception {
        assertEquals(2.33, nb.stod("2.33"), 0.01);
        assertEquals(.187, nb.stod(".187"), 0.001);
        assertEquals(0, nb.stod("0"), 0);
        assertEquals(120, nb.stod("120"), 0);
    }
}