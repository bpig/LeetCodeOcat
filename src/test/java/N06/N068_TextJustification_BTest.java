package N06;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */
public class N068_TextJustification_BTest {
    N068_TextJustification_B nb = new N068_TextJustification_B();

    @Test
    public void testFullJustify() throws Exception {
        String[] words = new String[]{
                "This", "is", "an", "example", "of", "text", "justification."};
        List<String> expect = Arrays.asList(
                "This    is    an", "example  of text", "justification.  ");
        assertEquals(expect, nb.fullJustify(words, 16));
    }
}