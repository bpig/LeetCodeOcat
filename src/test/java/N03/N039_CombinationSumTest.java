package N03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-28
 */
public class N039_CombinationSumTest {
    N039_CombinationSum nb = new N039_CombinationSum();

    @Test
    public void testCombinationSum() throws Exception {
        List<List<Integer>> expect = new ArrayList<List<Integer>>() {{
            add(Arrays.asList(2, 2, 3));
            add(Arrays.asList(7));
        }};
        assertEquals(expect, nb.combinationSum(new int[]{2, 3, 6, 7}, 7));
    }
}