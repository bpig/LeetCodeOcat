package N26;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by wenwen.xww on 2015/11/1.
 */
public class N264_UglyNumber2_O {
    public int min(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b < c) {
                return b;
            } else {
                return c;
            }
        }
    }
    public int nthUglyNumber(int n) {
        int[] res = new int[n];
        res[0] = 1;
        int two = 0;
        int three = 0;
        int five = 0;
        int num2 = 2;
        int num3 = 3;
        int num5 = 5;
        for (int i = 1; i < n; i++) {
            res[i] = min(num2, num3, num5);
            if (res[i] == num2) {
                num2 = 2 * res[++two];
            }
            if (res[i] == num3) {
                num3 = 3 * res[++three];
            }
            if (res[i] == num5) {
                num5 = 5 * res[++five];
            }
        }
        return res[n-1];
    }
}
