package N05;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */

import util.Interval;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of non-overlapping intervals,
 * insert a new interval into the intervals (merge if necessary).
 * <p>
 * You may assume that the intervals were initially sorted according to their start times.
 * <p>
 * Example 1:
 * Given intervals [1,3], [6,9], insert and merge [2,5] in as [1,5], [6,9].
 * <p>
 * Example 2:
 * Given [1,2], [3,5], [6,7], [8,10], [12,16],
 * insert and merge [4,9] in as [1,2], [3,10], [12,16].
 * <p>
 * This is because the new interval [4,9] overlaps with [3,5], [6,7], [8,10].
 */

public class N057_InsertInterval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> left = new ArrayList<>();
        List<Interval> right = new ArrayList<>();
        for (Interval it : intervals) {
            if (it.end < newInterval.start) {
                left.add(it);
                continue;
            } else if (it.start > newInterval.end) {
                right.add(it);
                continue;
            }
            newInterval.start = Math.min(newInterval.start, it.start);
            newInterval.end = Math.max(newInterval.end, it.end);
        }
        List<Interval> ans = new ArrayList<>();
        ans.addAll(left);
        ans.add(newInterval);
        ans.addAll(right);
        return ans;
    }
}
