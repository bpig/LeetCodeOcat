package N33;

/**
 * Created by shuai.li on 2016/4/7.
 */
public class N338_CountingBits {
    int count(int num) {
        int ct = 0;
        while (num > 0) {
            num = num & (num - 1);
            ct++;
        }
        return ct;
    }

    public int[] countBits(int num) {
        int[] ans = new int[num + 1];
        int pow = 1;
        for (int i = 1, t = 0; i <= num; i++, t++) {
            if (i == pow) {
                pow *= 2;
                t = 0;
            }
            ans[i] = ans[t] + 1;
        }
        return ans;
    }
}
