package N01;

import N01.N017_LetterCombinationsOfAPhoneNumber_B;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-13
 */
public class N017_LetterCombinationsOfAPhoneNumber_BTest {
    N017_LetterCombinationsOfAPhoneNumber_B nb = new N017_LetterCombinationsOfAPhoneNumber_B();
    @Test
    public void testLetterCombinations() throws Exception {
        assertEquals(0, nb.letterCombinations("").size());

    }
}