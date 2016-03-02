package N05;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */
public class N058_LengthOfLastWordTest {
    N058_LengthOfLastWord nb = new N058_LengthOfLastWord();
    @Test
    public void testLengthOfLastWord() throws Exception {
        assertEquals(5, nb.lengthOfLastWord("hello world"));
        assertEquals(5, nb.lengthOfLastWord("hello"));
        assertEquals(5, nb.lengthOfLastWord("hello "));
    }
}