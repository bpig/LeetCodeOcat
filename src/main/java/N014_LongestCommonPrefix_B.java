/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-13
 */

/**
 * Write a function to find the longest
 * common prefix string amongst an array of strings.
 */

public class N014_LongestCommonPrefix_B {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int len = Integer.MAX_VALUE;
        for (String str : strs) {
            len = Math.min(len, str.length());
        }
        for (int i = 0; i < len; ++i) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; ++j) {
                if (strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, len);
    }
}
