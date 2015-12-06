package N07;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */
public class N077_Combinations_BTest {
    N077_Combinations_B nb = new N077_Combinations_B();

    @Test
    public void testCombine() throws Exception {
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(Arrays.asList(1, 2));
        expect.add(Arrays.asList(1, 3));
        expect.add(Arrays.asList(1, 4));
        expect.add(Arrays.asList(2, 3));
        expect.add(Arrays.asList(2, 4));
        expect.add(Arrays.asList(3, 4));
        List<List<Integer>> ans = nb.combine(4, 2);
        assertEquals(expect, ans);
    }
}