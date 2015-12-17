package N18;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-16
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T,
 * for example: "ACGAATTCCG".
 * When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.
 * <p/>
 * Write a function to find all the 10-letter-long sequences
 * (substrings) that occur more than once in a DNA molecule.
 * <p/>
 * For example,
 * <p/>
 * Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",
 * <p/>
 * Return:
 * ["AAAAACCCCC", "CCCCCAAAAA"].
 */
public class N187_RepeatedDNASequences_B {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<Integer> firstTime = new HashSet<>();
        Set<Integer> secondTime = new HashSet<>();
        List<String> list = new ArrayList<>();

        char[] map = new char[26];
        map['A' - 'A'] = 0; // A = 00
        map['C' - 'A'] = 1; // B = 01
        map['G' - 'A'] = 2; // C = 10
        map['T' - 'A'] = 3; // D = 11

        int len = s.length();
        for (int i = 0; i <= len - 10; i++) {
            int sequence = 0;
            for (int j = i; j < i + 10; j++) {
                sequence = sequence << 2;
                sequence = sequence | map[s.charAt(j) - 'A'];
            }
            if (!firstTime.add(sequence) && secondTime.add(sequence)) {
                list.add(s.substring(i, i + 10));
            }
        }
        return list;
    }
}
