package N02;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-20
 */

/**
 * Implement strStr().
 * <p/>
 * Returns the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 */
public class N028_ImplementStrStr_B {
    public int strStr(String haystack, String needle) {
        //todo KMP
        return haystack.indexOf(needle);
    }
}
