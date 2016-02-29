package N03;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-29
 */
public class N030_SubstringWithConcatenationOfAllWordsTest {
    N030_SubstringWithConcatenationOfAllWords nb = new N030_SubstringWithConcatenationOfAllWords();

    @Test
    public void testFindSubstring() throws Exception {
        List<Integer> expect;
        expect = Arrays.asList(0, 9);
        assertEquals(expect,
                nb.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
    }
}