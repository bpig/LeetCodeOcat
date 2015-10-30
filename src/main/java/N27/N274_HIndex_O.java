package N27;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by wenwen.xww on 2015/10/30.
 */
public class N274_HIndex_O {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int res = citations.length;
        for (; res > 0; res--) {
            if (citations[citations.length - res] >= res) {
                return res;
            }
        }
        return res;
    }
}
