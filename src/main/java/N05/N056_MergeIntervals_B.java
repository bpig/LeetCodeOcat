package N05;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-29
 */

import util.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Given a collection of intervals, merge all overlapping intervals.
 * <p>
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 */
public class N056_MergeIntervals_B {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1) {
            return intervals;
        }
        int maxEnd = -1;
        for (Interval i : intervals) {
            maxEnd = Math.max(maxEnd, i.end);
        }
        short setLeft[] = new short[maxEnd + 1];
        short setRight[] = new short[maxEnd + 1];
        for (Interval i : intervals) {
            setLeft[i.start]++;
            setRight[i.end]++;
        }
        intervals.clear();
        Stack<Integer> s = new Stack();
        for (int i = 0; i <= maxEnd; i++) {
            while (setLeft[i] > 0) {
                s.push(i);
                setLeft[i]--;
            }
            while (setRight[i] > 0) {
                int start = s.pop();
                if (s.empty()) {
                    intervals.add(new Interval(start, i));
                }
                setRight[i]--;
            }
        }
        return intervals;
    }

    public List<Interval> scoreB(List<Interval> intervals) {
        Collections.sort(intervals, (o1, o2) -> o1.start - o2.start);
        List<Interval> ans = new ArrayList<>();
        Interval tail = null;
        for (Interval it : intervals) {
            if (tail == null || tail.end < it.start) {
                ans.add(it);
                tail = it;
            } else if (it.end > tail.end) {
                tail.end = it.end;
            }
        }
        return ans;
    }
}
