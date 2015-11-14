package N03;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-20
 */
public class N030_SubstringWithConcatenationOfAllWords_BTest {
    N030_SubstringWithConcatenationOfAllWords_B nb = new N030_SubstringWithConcatenationOfAllWords_B();

    @Test
    public void testSimple() throws Exception {
        List<Integer> lt = nb.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"});
        List<Integer> expect = Arrays.asList(0, 9);
        assertEquals(expect, lt);
    }
}