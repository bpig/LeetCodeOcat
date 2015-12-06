package N07;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given an absolute path for a file (Unix-style), simplify it.
 * <p/>
 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 * click to show corner cases.
 * <p/>
 * Corner Cases:
 * Did you consider the case where path = "/../"?
 * In this case, you should return "/".
 * Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
 * In this case, you should ignore redundant slashes and return "/home/foo".
 */
public class N071_SimplifyPath_B {
    public String simplifyPath(String path) {
        Deque<String> dq = new ArrayDeque<>();
        for (String item : path.split("/")) {
            if (item.equals(".") || item.equals("")) {
                continue;
            } else if (item.equals("..")) {
                dq.pollLast();
            } else {
                dq.add(item);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String item : dq) {
            sb.append("/").append(item);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
