package N07;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */
public class N071_SimplifyPath_BTest {
    N071_SimplifyPath_B nb = new N071_SimplifyPath_B();

    @Test
    public void testSimplifyPath() throws Exception {
        assertEquals("/", nb.simplifyPath("//"));
        assertEquals("/home/dir", nb.simplifyPath("/home//dir//"));
        assertEquals("/c", nb.simplifyPath("/a/./b/../../c/"));
        assertEquals("/", nb.simplifyPath("/."));
        assertEquals("/", nb.simplifyPath("/.."));
    }
}