/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-10
 */

import java.util.ArrayList;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern
 * on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * <p/>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p/>
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class N006_ZigZagConversion_B {
    public String convert(String s, int numRows) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; ++i) {
            matrix.add(new ArrayList<>());
        }
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

        }
        return "";
    }
}
