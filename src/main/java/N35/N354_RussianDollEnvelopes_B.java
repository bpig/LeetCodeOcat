package N35;

/**
 * Created by shuai.li on 6/9/16.
 */

import java.util.*;

/**
 * You have a number of envelopes with widths and heights given as a pair of integers (w, h).
 * One envelope can fit into another if and only if both the width and height of one envelope
 * is greater than the width and height of the other envelope.
 * <p>
 * What is the maximum number of envelopes can you Russian doll? (put one inside other)
 * <p>
 * Example:
 * Given envelopes = [[5,4],[6,4],[6,7],[2,3]],
 * the maximum number of envelopes you can Russian doll is 3 ([2,3] => [5,4] => [6,7]).
 */
public class N354_RussianDollEnvelopes_B {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> (a[0] - b[0]));
        return envelopes[1][0];
    }
}
