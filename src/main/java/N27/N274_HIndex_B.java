package N27;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-10-04
 */

import java.util.Arrays;

/**
 * Given an array of citations (each citation is a non-negative integer) of a researcher,
 * write a function to compute the researcher's h-index.
 * <p/>
 * According to the definition of h-index on Wikipedia:
 * "A scientist has index h if h of his/her N papers have at least h citations each,
 * and the other N − h papers have no more than h citations each."
 * <p/>
 * For example, given citations = [3, 0, 6, 1, 5],
 * which means the researcher has 5 papers in total
 * and each of them had received 3, 0, 6, 1, 5 citations respectively.
 * Since the researcher has 3 papers with at least 3 citations each
 * and the remaining two with no more than 3 citations each, his h-index is 3.
 * <p/>
 * Note: If there are several possible values for h, the maximum one is taken as the h-index.
 */
public class N274_HIndex_B {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int hidx = 0;
        for (int i = citations.length - 1; i >= 0; --i) {
            if (hidx >= citations[i]) {
                break;
            }
            ++hidx;
        }
        return hidx;
    }

    public double stod(String s) {
        int sep = 0;
        long a = 0;
        for (; sep < s.length() && s.charAt(sep) != '.'; ++sep) {
            a = a * 10 + s.charAt(sep) - '0';
        }
        sep++;
        double b = 0.0;
        for (int i = s.length() - 1; i >= sep; --i) {
            b = b / 10 + s.charAt(i) - '0';
        }
        b /= 10;
        return a + b;
    }
}
