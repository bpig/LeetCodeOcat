package N05;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-22
 */
public class N050_PowXN_BTest {
    N050_PowXN_B nb = new N050_PowXN_B();
    @Test
    public void testMyPow() throws Exception {
        assertEquals(9.0, nb.myPow(3, 2), 0.01);
        assertEquals(177147.0, nb.myPow(3, 11), 0.01);
        assertEquals(5.64e-6, nb.myPow(3, -11), 1e-7);
        assertEquals(1, nb.myPow(3, 0), 0.01);
        assertEquals(1e-20, nb.myPow(1e-5, 2147483647), 0.01);
        assertEquals(2.5e-5, nb.myPow(34.00515, -3), 1e-6);
    }
}