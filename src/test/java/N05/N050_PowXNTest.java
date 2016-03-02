package N05;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */
public class N050_PowXNTest {
    N050_PowXN nb = new N050_PowXN();

    @Test
    public void testMyPow() throws Exception {
        assertEquals(1, nb.myPow(1.0, -2147483648), 0.01);
        assertEquals(9.0, nb.myPow(3, 2), 0.01);
        assertEquals(177147.0, nb.myPow(3, 11), 0.01);
        assertEquals(5.64e-6, nb.myPow(3, -11), 1e-7);
        assertEquals(1, nb.myPow(3, 0), 0.01);
        assertEquals(1e-20, nb.myPow(1e-5, 2147483647), 0.01);
        assertEquals(2.5e-5, nb.myPow(34.00515, -3), 1e-6);
    }
}