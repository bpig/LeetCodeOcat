package N06;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of words and a length L,
 * format the text such that each line has exactly L characters and is fully (left and right) justified.
 * <p/>
 * You should pack your words in a greedy approach;
 * that is, pack as many words as you can in each line.
 * Pad extra spaces ' ' when necessary so that each line has exactly L characters.
 * <p/>
 * Extra spaces between words should be distributed as evenly as possible.
 * If the number of spaces on a line do not divide evenly between words,
 * the empty slots on the left will be assigned more spaces than the slots on the right.
 * <p/>
 * For the last line of text, it should be left justified and no extra space is inserted between words.
 * <p/>
 * For example,
 * words: ["This", "is", "an", "example", "of", "text", "justification."]
 * L: 16.
 * <p/>
 * Return the formatted lines as:
 * [
 * "This    is    an",
 * "example  of text",
 * "justification.  "
 * ]
 * Note: Each word is guaranteed not to exceed L in length.
 * <p/>
 * Corner Cases:
 * A line other than the last line might contain only one word. What should you do in this case?
 * In this case, that line should be left-justified.
 * <p/>
 * For each line, I first figure out which words can fit in.
 * According to the code, these words are words[i] through words[i+k-1].
 * Then spaces are added between the words.
 * The trick here is to use mod operation to manage the spaces that can't be evenly distrubuted:
 * the first (L-l) % (k-1) gaps acquire an additional space.
 */
public class N068_TextJustification_B {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list = new ArrayList<>();

        for (int i = 0, w; i < words.length; i = w) {
            int len = -1;
            for (w = i; w < words.length && len + words[w].length() + 1 <= maxWidth; w++) {
                len += words[w].length() + 1;
            }

            StringBuilder strBuilder = new StringBuilder(words[i]);
            int space = 1, extra = 0;
            if (w != i + 1 && w != words.length) { // not 1 char, not last line
                space = (maxWidth - len) / (w - i - 1) + 1;
                extra = (maxWidth - len) % (w - i - 1);
            }
            for (int j = i + 1; j < w; j++) {
                for (int s = space; s > 0; s--) {
                    strBuilder.append(' ');
                }
                if (extra-- > 0) {
                    strBuilder.append(' ');
                }
                strBuilder.append(words[j]);
            }
            int strLen = maxWidth - strBuilder.length();
            while (strLen-- > 0) {
                strBuilder.append(' ');
            }
            list.add(strBuilder.toString());
        }

        return list;
    }
}
