package N05;

import org.junit.Test;
import util.Interval;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-29
 */
public class N056_MergeIntervals_BTest {
    N056_MergeIntervals_B nb = new N056_MergeIntervals_B();

    @Test
    public void testMerge() throws Exception {
        List<Interval> intervals;
        String expect;
        intervals = Interval.createList("1,4;0,2;3,5");
        expect = "0,5";
        assertEquals(expect,
                Interval.toString(nb.merge(intervals)));
    }
}