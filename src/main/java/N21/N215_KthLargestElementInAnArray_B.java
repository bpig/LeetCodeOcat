package N21;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-19
 */

/**
 * Find the kth largest element in an unsorted array.
 * Note that it is the kth largest element in the sorted order,
 * not the kth distinct element.
 * <p/>
 * For example,
 * Given [3,2,1,5,6,4] and k = 2, return 5.
 * <p/>
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ array's length.
 */
public class N215_KthLargestElementInAnArray_B {
    public int findKthLargest(int[] nums, int k) {
        return quickselect(nums, nums.length - k, 0, nums.length - 1);
    }

    int quickselect(int A[], int k, int left, int end) {
        int mid = left;
        // Take A[end] as the pivot,
        // Put numbers < pivot to pivot's left
        for (int i = mid; i < end; i++) {
            if (A[i] <= A[end]) {
                swap(A, mid++, i);
            }
        }
        // Finally, swap A[end] with A[mid] (mid is actually the index of the pivot A[end])
        swap(A, mid, end);

        if (mid == k) {
            // Found kth smallest number
            return A[mid];
        } else if (mid > k) {
            // Check left part
            return quickselect(A, k, left, mid - 1);
        } else {
            // Check Right part
            return quickselect(A, k, mid + 1, end);
        }
    }

    void swap(int A[], int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}
