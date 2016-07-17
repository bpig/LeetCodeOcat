package N31;

/**
 * Created by shuai.li on 6/6/16.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a string which contains only lowercase letters,
 * remove duplicate letters so that every letter appear once and only once.
 * You must make sure your result is the smallest in lexicographical order among all possible results.
 * <p>
 * Example:
 * Given "bcabc"
 * Return "abc"
 * <p>
 * Given "cbacdcbc"
 * Return "acdb"
 */
public class N316_RemoveDuplicateLetters_B {
    public String removeDuplicateLetters(String s) {
        int[] mark = new int[26];
        Arrays.fill(mark, -1);
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; ++i) {

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mark.length; ++i) {

        }
        return sb.toString();
    }
}
