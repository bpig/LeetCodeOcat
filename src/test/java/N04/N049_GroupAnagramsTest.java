package N04;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */
public class N049_GroupAnagramsTest {
    N049_GroupAnagrams nb = new N049_GroupAnagrams();

    @Test
    public void testGroupAnagrams() throws Exception {
        List<List<String>> expect;
        expect = new ArrayList<List<String>>() {{
            add(Arrays.asList(""));
        }};
        assertEquals(expect, nb.groupAnagrams(new String[]{""}));
    }
}