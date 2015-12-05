package N06;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-05
 */

import java.util.LinkedList;
import java.util.List;

/**
 * The set [1,2,3,…,n] contains a total of n! unique permutations.
 * <p/>
 * By listing and labeling all of the permutations in order,
 * We get the following sequence (ie, for n = 3):
 * <p/>
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * Given n and k, return the kth permutation sequence.
 * <p/>
 * Note: Given n will be between 1 and 9 inclusive.
 */
public class N060_PermutationSequence_B {
    /**
     * This problem consists of two parts.
     * <p/>
     * Part one, find the array A[0..n-1] that satisfies:
     * <p/>
     * k-1 = (n-1)!A[0] + (n-2)!A[1] + ... + 2!A[n-3] + 1!A[n-2] + 0!*A[n-1]
     * 4 = 2!*2 + 1!*0 + 0!*1
     * and 0 <= A[i] < n-i (so the last item in the formula above is always 0).
     * <p/>
     * It's obvious that the array A[0..n-1] can be calculated
     * either from 0 to n-1 or reversely.
     * In order to avoid previous calculation of factorial,
     * A[0..n-1] is calculated from end to start here.
     * <p/>
     * Part two, translate A[0..n-1] into final sequence number.
     * A[0..n-1] can be translated from end to start step by step,
     * just like the mathematical solution of Joseph Circle.
     */
    public String getPermutation(int n, int k) {
        k--;
        int fact = 1;
        char[] result = new char[n];
        result[n - 1] = '1';
        for (int i = 2; i <= n; i++) {
            fact *= i;
            int remain = k % fact;
            result[n - i] = (char) (remain * i / fact + '1');
            for (int j = n - i + 1; j < n; j++) {
                if (result[j] >= result[n - i]) {
                    result[j] += 1;
                }
            }
            k -= k % fact;
        }
        return new String(result);
    }

    public String scoreAMinus(int n, int k) {
        int[] factorial = new int[n + 1];
        List<Integer> nums = new LinkedList<>();
        factorial[0] = 1;
        for (int i = 1; i <= n; ++i) {
            nums.add(i);
            factorial[i] = i * factorial[i - 1];
        }
        k--;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; ++i) {
            int idx = k / factorial[n - i];
            sb.append(nums.get(idx));
            nums.remove(idx);
            k -= factorial[n - i] * idx;
        }
        return sb.toString();
    }
}
