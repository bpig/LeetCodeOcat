package N04;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-29
 */
public class N040_CombinationSumIITest {
    N040_CombinationSumII nb = new N040_CombinationSumII();

    @Test
    public void testCombinationSum2() throws Exception {
        int[] nums = new int[]{10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> expect;
        expect = new ArrayList<List<Integer>>() {{
            add(Arrays.asList(1, 1, 6));
            add(Arrays.asList(1, 2, 5));
            add(Arrays.asList(1, 7));
            add(Arrays.asList(2, 6));
        }};
        assertEquals(expect, nb.combinationSum2(nums, 8));
    }
}