package N05;

import org.junit.Test;
import util.Interval;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-29
 */
public class N057_InsertInterval_BTest {
    N057_InsertInterval_B nb = new N057_InsertInterval_B();

    @Test
    public void testInsert() throws Exception {
        List<Interval> intervals;
        Interval newInterval;
        String expect;
        List<Interval> result;

        intervals = Interval.createList("1,2;3,5;6,7;8,10;12,16");
        newInterval = Interval.create("4,9");
        expect = "1,2;3,10;12,16";
        result = nb.insert(intervals, newInterval);
        assertEquals(expect, Interval.toString(result));

        intervals = Interval.createList("1,3;6,9");
        newInterval = Interval.create("2,5");
        expect = "1,5;6,9";
        result = nb.insert(intervals, newInterval);
        assertEquals(expect, Interval.toString(result));

        intervals = Interval.createList("");
        newInterval = Interval.create("5,7");
        expect = "5,7";
        result = nb.insert(intervals, newInterval);
        assertEquals(expect, Interval.toString(result));
    }
}