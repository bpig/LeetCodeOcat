package N00; /**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-08
 */

/**
 * There are two sorted arrays nums1 and nums2
 * of size m and n respectively.
 * Find the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 */
public class N004_MedianOfTwoSortedArrays_B {
    public double findMedianSortedArrays(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        if (n > m) {
            return findMedianSortedArrays(B, A);
        }

        int k = (n + m - 1) / 2;
        int l = 0;
//        int r = Math.min(k, n);
        int r = n;
        while (l < r) {
            int min1 = (l + r) / 2;
            int min2 = k - min1;
            if (A[min1] < B[min2]) {
                l = min1 + 1;
            } else {
                r = min1;
            }
        }
        // odd
        int al = l > 0 ? A[l - 1] : Integer.MIN_VALUE;
        int ar = k - l >= 0 ? B[k - l] : Integer.MIN_VALUE;
        int a = Math.max(al, ar);

        if (((n + m) & 1) == 1) {
            return (double) a;
        }
        // even
        int bl = l < n ? A[l] : Integer.MAX_VALUE;
        int br = k - l + 1 < m ? B[k - l + 1] : Integer.MAX_VALUE;
        int b = Math.min(bl, br);

        return (a + b) / 2.0;
    }
}
