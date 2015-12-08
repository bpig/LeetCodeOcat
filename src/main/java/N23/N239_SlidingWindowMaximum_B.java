package N23;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-07
 */

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given an array nums, there is a sliding window of size k
 * which is moving from the very left of the array to the very right.
 * You can only see the k numbers in the window.
 * Each time the sliding window moves right by one position.
 * <p/>
 * For example,
 * Given nums = [1,3,-1,-3,5,3,6,7], and k = 3.
 * <p/>
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 * 1  [3  -1  -3] 5  3  6  7       3
 * 1   3 [-1  -3  5] 3  6  7       5
 * 1   3  -1 [-3  5  3] 6  7       5
 * 1   3  -1  -3 [5  3  6] 7       6
 * 1   3  -1  -3  5 [3  6  7]      7
 * Therefore, return the max sliding window as [3,3,5,5,6,7].
 * <p/>
 * Note:
 * You may assume k is always valid, ie: 1 ≤ k ≤ input array's size for non-empty array.
 * <p/>
 * Follow up:
 * Could you solve it in linear time?
 * Hint:
 * <p/>
 * How about using a data structure such as deque (double-ended queue)?
 * The queue size need not be the same as the window’s size.
 * Remove redundant elements and the queue should store only elements that need to be considered.
 * <p/>
 * For Example: A = [2,1,3,4,6,3,8,9,10,12,56], w=4
 * <p/>
 * partition the array in blocks of size w=4.
 * The last block may have less then w. 2, 1, 3, 4 | 6, 3, 8, 9 | 10, 12, 56|
 * <p/>
 * Traverse the list from start to end and calculate max so far.
 * Reset max after each block boundary (of w elements).
 * left_max[] = 2, 2, 3, 4 | 6, 6, 8, 9 | 10, 12, 56
 * <p/>
 * Similarly calculate max in future by traversing from end to start.
 * right_max[] = 4, 4, 4, 4 | 9, 9, 9, 9 | 56, 56, 56
 * <p/>
 * now, sliding max at each position i in current window,
 * sliding-max(i) = max{rightmax(i), leftmax(i+w-1)}
 * sliding_max = 4, 6, 6, 8, 9, 10, 12, 56
 */
public class N239_SlidingWindowMaximum_B {
    class Pair {
        public Pair(int f, int s) {
            first = f;
            second = s;
        }

        public int first;
        public int second;
    }

    class Monoqueue {
        //pair.first: the actual value,
        //pair.second:
        //    how many elements were deleted between it and the one before it.
        Deque<Pair> dp = new ArrayDeque<>();

        public void push(int val) {
            int count = 0;
            while (!dp.isEmpty() && dp.getLast().first < val) {
                count += dp.getLast().second + 1;
                dp.removeLast();
            }
            dp.add(new Pair(val, count));
        }

        public int max() {
            return dp.getFirst().first;
        }

        public void pop() {
            if (dp.getFirst().second > 0) {
                dp.getFirst().second--;
                return;
            }
            dp.removeFirst();
        }
    }

    public int[] maxSlidingWindow(int[] nums, int w) {
        if (nums == null || w <= 1) {
            return nums;
        }
        int[] ans = new int[nums.length - w + 1];
        Monoqueue mq = new Monoqueue();
        //push first w - 1 numbers;
        int i = 0;
        for (; i < w - 1; ++i) {
            mq.push(nums[i]);
        }
        for (; i < nums.length; ++i) {
            // push a new element to queue;
            mq.push(nums[i]);
            // report the current max in queue;
            ans[i - w + 1] = mq.max();
            // pop first element in queue;
            mq.pop();
        }
        return ans;
    }

    public int[] maxSlidingWindowDeque(int[] nums, int w) {
        if (nums == null || w <= 1) {
            return nums;
        }
        int[] res = new int[nums.length - w + 1];
        Deque<Integer> memo = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while (!memo.isEmpty() && memo.getLast() < nums[i]) {
                memo.removeLast();
            }
            memo.add(nums[i]);
            if (i < w - 1) {
                continue;
            }
            res[i - w + 1] = memo.peek();
            if (nums[i - w + 1] == res[i - w + 1]) {
                memo.removeFirst();
            }
        }
        return res;
    }

    // fastest
    public int[] scoreA(int[] nums, int w) {
        int n = nums.length;
        if (n == 0 || w <= 1) {
            return nums;
        }
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = nums[0];
        right[n - 1] = nums[n - 1];

        for (int i = 1, j = n - 2; i < n; i++, j--) {
            left[i] = (i % w == 0) ? nums[i] : Math.max(left[i - 1], nums[i]);
            right[j] = (j % w == 0) ? nums[j] : Math.max(right[j + 1], nums[j]);
        }

        int[] ans = new int[n - w + 1];
        for (int i = 0; i + w <= n; i++) {
            ans[i] = Math.max(right[i], left[i + w - 1]);
        }

        return ans;
    }
}
