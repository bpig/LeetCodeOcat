package N07;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-05
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string S and a string T,
 * find the minimum window in S which will contain all the characters in T in complexity O(n).
 * <p/>
 * For example,
 * S = "ADOBECODEBANC"
 * T = "ABC"
 * Minimum window is "BANC".
 * <p/>
 * Note:
 * If there is no such window in S that covers all characters in T, return the empty string "".
 * <p/>
 * If there are multiple such windows,
 * you are guaranteed that there will always be only one unique minimum window in S.
 * <p/>
 * https://leetcode.com/discuss/72701/here-is-a-template-that-can-solve-most-substring-problems
 */
public class N076_MinimumWindowSubstring_B {
    public String minWindow(String s, String t) {
        int[] kv = new int[128];
        int counter = t.length();
        int begin = 0;
        int end = 0;
        int d = Integer.MAX_VALUE;
        int head = 0;
        for (int i = 0; i < t.length(); ++i) {
            kv[t.charAt(i)]++;
        }
        while (end < s.length()) {
            if (kv[s.charAt(end)] > 0) {
                counter--;
            }
            kv[s.charAt(end)]--;
            end++;
            while (counter == 0) { // valid
                if (end - begin < d) {
                    head = begin;
                    d = end - begin;
                }
                if (kv[s.charAt(begin)] == 0) { // make invalid
                    counter++;
                }
                kv[s.charAt(begin)]++;
                begin++;
            }

        }
        return d == Integer.MAX_VALUE ? "" : s.substring(head, head + d);
    }

    boolean checkKv(int[] kv) {
        for (int i = 0; i < kv.length; ++i) {
            if (kv[i] > 0) {
                return false;
            }
        }
        return true;
    }

    public String scoreB(String s, String t) {
        int[] kv = new int[58];
        for (int i = 0; i < s.length(); ++i) {
            kv[s.charAt(i) - 'A']++;
        }
        for (int i = 0; i < t.length(); ++i) {
            kv[t.charAt(i) - 'A']--;
        }
        for (int i = 0; i < kv.length; ++i) {
            if (kv[i] < 0) {
                return "";
            }
            kv[i] = 0;
        }


        for (int i = 0; i < t.length(); ++i) {
            kv[t.charAt(i) - 'A']++;
        }
        List<Integer> seq = new ArrayList<>();
        for (int i = 0; i < s.length(); ++i) {
            if (kv[s.charAt(i) - 'A'] != 0) {
                seq.add(i);
            }
        }
        int lo = 0;
        int hi = lo;
        int ansLo = 0;
        int ansHi = seq.size() - 1;
        while (hi < seq.size()) {
            char c = s.charAt(seq.get(hi));
            kv[c - 'A']--;
            if (checkKv(kv)) {
                do {
                    char h = s.charAt(seq.get(lo));
                    kv[h - 'A']++;
                    lo++;
                } while (checkKv(kv));
                if (seq.get(hi) - seq.get(lo - 1) < seq.get(ansHi) - seq.get(ansLo)) {
                    ansHi = hi;
                    ansLo = lo - 1;
                }
            }
            hi++;
        }

        return s.substring(seq.get(ansLo), seq.get(ansHi) + 1);
    }
}
