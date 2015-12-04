package N08;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-04
 */

import java.util.Stack;

/**
 * Given n non-negative integers representing the histogram's bar height
 * where the width of each bar is 1,
 * find the area of largest rectangle in the histogram.
 * <p/>
 * Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].
 * <p/>
 * The largest rectangle is shown in the shaded area, which has area = 10 unit.
 * <p/>
 * For example,
 * Given height = [2,1,5,6,2,3],
 * return 10.
 */
public class N084_LargestRectangleInHistogram_B {
    public int scoreB(int[] height) {
        int[] data = new int[height.length + 1];
        for (int i = 0; i < height.length; ++i) {
            data[i] = height[i];
        }
        data[height.length] = 0;
        int size = data.length;
        Stack<Integer> stk = new Stack<>();
        int i = 0, ans = 0;
        while (i < size) {
            if (stk.empty() || data[i] >= data[stk.peek()]) {
                stk.push(i++);
            } else {
                int idx = stk.pop();
                int span = stk.empty() ? i : i - stk.peek() - 1;
                ans = Math.max(ans, data[idx] * span);
            }
        }
        return ans;
    }

    public int largestRectangleArea(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 0; i < right.length; ++i) {
            right[i] = n;
        }
        int p;
        for (int i = 1; i < n; ++i) {
            p = i - 1;
            while (p >= 0 && height[i] <= height[p]) {
                p = left[p] - 1;
            }
            left[i] = p + 1;
        }
        for (int i = n - 2; i >= 0; --i) {
            p = i + 1;
            while (p < n && height[i] <= height[p]) {
                p = right[p];
            }
            right[i] = p;
        }
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans = Math.max(ans, height[i] * (right[i] - left[i]));
        }
        return ans;
    }
}
