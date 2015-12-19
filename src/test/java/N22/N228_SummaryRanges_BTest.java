package N22;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-19
 */
public class N228_SummaryRanges_BTest {
    N228_SummaryRanges_B nb = new N228_SummaryRanges_B();

    @Test
    public void testSummaryRanges() throws Exception {
        //[0,1,2,4,5,7], return ["0->2","4->5","7"].
        int[] nums;
        List<String> expect;
        nums = new int[]{0, 1, 2, 4, 5, 7};
        expect = Arrays.asList("0->2", "4->5", "7");
        assertEquals(expect, nb.summaryRanges(nums));
    }
}