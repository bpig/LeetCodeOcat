package N16;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-08
 */

/**
 * Given a positive integer,
 * return its corresponding column title as appear in an Excel sheet.
 * <p/>
 * For example:
 * <p/>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 */
public class N168_ExcelSheetColumnTitle_B {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int m = (n - 1) % 26;
            sb.append((char)('A' + m));
            n = (n - 1) / 26;
        }
        return sb.reverse().toString();
    }

    public String score0(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int m = n % 26;
            n /= 26;
            if (m != 0) {
                sb.append((char)('A' + m - 1));
            } else {
                sb.append('Z');
                --n;
            }
        }
        sb.reverse();
        return sb.toString();
    }
}
