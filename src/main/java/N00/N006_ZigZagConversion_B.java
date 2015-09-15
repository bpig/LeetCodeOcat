package N00; /**
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
        if (numRows <= 1 || numRows >= s.length() || s == null) {
            return s;
        }

        int zigSpan = (numRows - 1) * 2;
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += zigSpan) {
                //add every element for each column and the span is zigSpan
                res.append(s.charAt(j));
                //if not the first and last column, just add additional element if not beyond the length of s
                //and the span is zigSpan+j-2*i
                if (i != 0 && i != numRows - 1 && zigSpan + j - 2 * i < s.length()) {
                    res.append(s.charAt(zigSpan + j - 2 * i));
                }
            }
        }
        return res.toString();
    }

    public String score0(String s, int numRows) {
        ArrayList<ArrayList<Character>> matrix = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; ++i) {
            matrix.add(new ArrayList<>());
        }
        ArrayList<Integer> rowIndex = new ArrayList<>();
        for (int i = 0; i < numRows; ++i) {
            rowIndex.add(i);
        }
        for (int i = numRows - 2; i > 0; --i) {
            rowIndex.add(i);
        }
        int count = rowIndex.size();
        for (int i = 0; i < s.length(); ++i) {
            matrix.get(rowIndex.get(i % count)).add(s.charAt(i));
        }
        StringBuilder builder = new StringBuilder();
        matrix.forEach(row -> row.forEach(builder::append));

        return builder.toString();
    }
}
