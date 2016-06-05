package N17;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/5/15
 */

/**
 * Related to question Excel Sheet Column Title
 * <p>
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * <p>
 * For example:
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 */
public class N171_ExcelSheetColumnNumber_B {
    public int titleToNumber(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            ans = (s.charAt(i) - 'A' + 1) + ans * 26;
        }
        return ans;
    }
}
