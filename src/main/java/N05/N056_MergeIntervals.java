package N05;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */

import util.Interval;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a collection of intervals, merge all overlapping intervals.
 * <p>
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 */

public class N056_MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1) {
            return intervals;
        }
        int maxEnd = Integer.MIN_VALUE;
        for (Interval it : intervals) {
            maxEnd = Math.max(it.end, maxEnd);
        }
        short[] left = new short[maxEnd + 1];
        short[] right = new short[maxEnd + 1];
        for (Interval it : intervals) {
            left[it.start]++;
            right[it.end]++;
        }
        List<Interval> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= maxEnd; ++i) {
            while (left[i] > 0) {
                stack.push(i);
                left[i]--;
            }
            while (right[i] > 0) {
                int start = stack.pop();
                if (stack.empty()) {
                    ans.add(new Interval(start, i));
                }
                right[i]--;
            }
        }
        return ans;
    }
}
