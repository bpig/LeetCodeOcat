package N29;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-20
 */

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Median is the middle value in an ordered integer list.
 * If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.
 * <p/>
 * Examples:
 * [2,3,4] , the median is 3
 * <p/>
 * [2,3], the median is (2 + 3) / 2 = 2.5
 * <p/>
 * Design a data structure that supports the following two operations:
 * <p/>
 * void addNum(int num) - Add a integer number from the data stream to the data structure.
 * double findMedian() - Return the median of all elements so far.
 * For example:
 * <p/>
 * add(1)
 * add(2)
 * findMedian() -> 1.5
 * add(3)
 * findMedian() -> 2
 */
public class N295_FindMedianFromDataStream_B {
    PriorityQueue<Integer> big;
    PriorityQueue<Integer> small;

    public N295_FindMedianFromDataStream_B() {
        big = new PriorityQueue<>();
        small = new PriorityQueue<>(Collections.reverseOrder());
    }

    // Understanding is we will be maintain 2 heaps max and min.
    // The max heap will store the smaller half
    // and the min heap will store the larger half of the incoming numbers.
    // Basically we are trying to mimic a
    // balanced tree with this model of representation,
    // which means the max heap at the most can have only one extra
    // element than the min heap.
    // We need to maintain the ordering that the root of the max heap < root of min heap

    // Adds a number into the data structure.
    public void addNum(int num) {
        small.offer(num);
        big.offer(small.poll());
        if (small.size() < big.size()) {
            small.offer(big.poll());
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        return big.size() == small.size() ? (small.peek() + big.peek()) / 2.0 : small.peek();
    }
}
