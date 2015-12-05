package N06;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-05
 */
public class N060_PermutationSequence_BTest {
    N060_PermutationSequence_B nb = new N060_PermutationSequence_B();
    @Test
    public void testGetPermutation() throws Exception {
        assertEquals("312", nb.getPermutation(3,5));
    }
}