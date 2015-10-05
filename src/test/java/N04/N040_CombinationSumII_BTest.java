package N04;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-27
 */
public class N040_CombinationSumII_BTest {
    N040_CombinationSumII_B nb = new N040_CombinationSumII_B();

    @Test
    public void testCombinationSum2() throws Exception {
        List<List<Integer>> expect = new ArrayList<List<Integer>>() {{
            add(Arrays.asList(1, 1, 6));
            add(Arrays.asList(1, 2, 5));
            add(Arrays.asList(1, 7));
            add(Arrays.asList(2, 6));
        }};
        assertEquals(expect, nb.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }
}